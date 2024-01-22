package access_modifier;

public class Circle {
    private static final double PI = 3.14;
    private static double maxRadius = 0;
    private static int id = 0;
    private static double sumArea = 0;
    private double radius = 0;

    public Circle() {
        countAndId();
        findMaxRadius();
        calSumArea();
    }

    public Circle(double radius) {
        this.radius = radius;
        countAndId();
        findMaxRadius();
        calSumArea();
    }

    public static double getMaxRadius() {
        return maxRadius;
    }

    public static double getSumArea() {
        return sumArea;
    }

    public void countAndId() {
        id++;
    }

    public int getId() {
        return id;
    }

    public int getNumsOfObject() {
        return id;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }

    public void findMaxRadius() {
        if (radius > maxRadius)
            maxRadius = radius;
    }

    public void calSumArea() {
        sumArea += getArea();
    }
}
