import java.util.Map;

/**
 * Created by FVolodia on 26.04.16.
 */
public class RobotFactory {
    public static final String TYPE_HYDRA1 = "HYDRA_1";
    public static final String TYPE_HYDRA2 = "HYDRA_2";
    public static final String TYPE_HYDRA3 = "HYDRA_3";

    private Map<String, Robot> robots;

    public RobotFactory() {
        robots = new java.util.HashMap<>();
    }

    public void register(String type, Robot robot) {
        this.robots.put(type, robot);
    }

    public Robot create(String type) {
        Robot prototype = robots.get(type);
        //ugly solution
        if (prototype instanceof UnionRobot) {
            UnionRobot unionPrototype = (UnionRobot) prototype;
            UnionRobot unionResult = new UnionRobot();
            unionResult.addRobots(unionPrototype.getRobots());
            return unionResult;
        } else {
            SimpleRobot result = new SimpleRobot();
            result.setHeight(prototype.getHeight());
            result.setSpeed(prototype.getSpeed());
            result.setWeight(prototype.getWeight());
            return result;
        }
    }

    public Robot[] create(String type, int count) {
        Robot[] result = new Robot[count];
        for (int i = 0; i < count; i++) {
            result[i] = create(type);
        }
        return result;
    }
}
