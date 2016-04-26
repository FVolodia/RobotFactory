import java.util.ArrayList;
import java.util.List;

/**
 * Created by FVolodia on 26.04.16.
 */
public class UnionRobot implements Robot {
    private List<Robot> robots;

    public UnionRobot() {
        robots = new ArrayList<>();
    }

    public void addRobot(Robot r) {
        robots.add(r);
    }

    public void addRobots(Robot... robots) {
        for (Robot r : robots) {
            this.robots.add(r);
        }
    }

    public void addRobots(List<Robot> robots) {
        this.robots.addAll(robots);
    }

    public List<Robot> getRobots() {
        return robots;
    }

    @Override
    public int getSpeed() {
        if (robots.isEmpty()) {
            throw new RuntimeException("Union Robot is not define properly");
        }
        int speedMin = robots.get(0).getSpeed();
        for (Robot r : robots) {
            if (speedMin > r.getSpeed()) {
                speedMin = r.getSpeed();
            }
        }
        return speedMin;
    }

    @Override
    public int getWeight() {
        int result = 0;
        for (Robot r : robots) {
            result += r.getWeight();
        }
        return result;
    }

    @Override
    public int getHeight() {
        int result = 0;
        for (Robot r : robots) {
            result += r.getHeight();
        }
        return result;
    }
}
