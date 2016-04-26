import java.util.ArrayList;

/**
 * Created by FVolodia on 26.04.16.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("TEST ROBOTS");

//        Створюємо Головного робота

        UnionRobot unionRobot = new UnionRobot();

//        Створюємо фабрику мікророботів, Реєструємо типи бажаних мікроРоботів та їх параметри

        RobotFactory robotFactory = new RobotFactory();
        robotFactory.register(RobotFactory.TYPE_HYDRA2, new SimpleRobot(38, 12, 233));
        robotFactory.register(RobotFactory.TYPE_HYDRA1, new SimpleRobot(23, 45, 123));


//        Монтуємо головного робота, запускаємо фабрику для створення 5 та 4 мікророботів різних типів для нього;

        unionRobot.addRobots(robotFactory.create(RobotFactory.TYPE_HYDRA2, 5));
        unionRobot.addRobots(robotFactory.create(RobotFactory.TYPE_HYDRA1, 4));

// Отримуємо характеристики Головного робота
        System.out.println("SPEED - " + unionRobot.getSpeed());
        System.out.println("WEIGHT - " + unionRobot.getWeight());
        System.out.println("HEIGHT - " + unionRobot.getHeight());

    }
}
