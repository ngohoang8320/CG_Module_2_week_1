public class FanClass {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed = SLOW;

    private boolean on = false;

    private double radius = 5;

    private String color = "blue";

    public FanClass() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /*public FanClass(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }*/

    public String toString() {
        if (on) {
            String status = "Status:\nSpeed is: " + speed + "\nColor is: " + color + "\nRadius is: " + radius + ".";
            return status;
        } else {
            return "Fan is off.";
        }
    }
}
