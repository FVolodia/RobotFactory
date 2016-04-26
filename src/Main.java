/**
 * Created by FVolodia on 26.04.16.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("TEST");
        RobotFactory robotFactory = new RobotFactory();
        robotFactory.register(RobotFactory.TYPE_HYDRA1,new SimpleRobot(10,28,45));
        robotFactory.create(RobotFactory.TYPE_HYDRA1);
    }
}
