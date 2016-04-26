/**
 * Created by FVolodia on 26.04.16.
 */
public class SimpleRobot implements Robot {
    private int weight;
    private int speed;
    private int height;

    public SimpleRobot(int weight, int speed, int height) {
        this.weight = weight;
        this.speed = speed;
        this.height = height;
    }

    public SimpleRobot() {
    }

    @Override
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
