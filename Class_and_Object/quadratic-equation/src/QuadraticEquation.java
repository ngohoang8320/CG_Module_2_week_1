import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        double delta = equation.getDiscriminant();

        if (delta > 0) {
            System.out.printf("The equation has two roots: %.6f and %.5f", equation.getRoot1(), equation.getRoot2());
        } else if (delta == 0) {
            System.out.println("The equation has one roots: " + equation.getRoot1());
        } else {
            System.out.println("The equation has no real roots.");
        }


    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        double del = b * b - 4 * a * c;
        return del;
    }

    public double getRoot1() {
        double r1 = (-b + Math.pow(getDiscriminant(), 0.5)) / (2 * a);
        return r1;
    }

    public double getRoot2() {
        double r2 = (-b - Math.pow(getDiscriminant(), 0.5)) / (2 * a);
        return r2;
    }
}
