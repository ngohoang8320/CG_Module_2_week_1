package access_modifier;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(6);
        System.out.println("After create circle 1:");
        System.out.println("Id:" + circle1.getId());
        System.out.println("Max Radius now:" + Circle.getMaxRadius());
        System.out.println("Sum Area now:" + Circle.getSumArea());
        System.out.println();


        System.out.println("After create circle 2:");
        Circle circle2 = new Circle(2);
        System.out.println("Id:" + circle2.getId());
        System.out.println("Max Radius now:" + Circle.getMaxRadius());
        System.out.println("Sum Area now:" + Circle.getSumArea());
        System.out.println();


        System.out.println("After create circle 3:");
        Circle circle3 = new Circle(15);
        System.out.println("Id:" + circle3.getId());
        System.out.println("Max Radius now:" + Circle.getMaxRadius());
        System.out.println("Sum Area now:" + Circle.getSumArea());
        System.out.println();


        System.out.println("After create circle 4:");
        Circle circle4 = new Circle(20);
        System.out.println("Id:" + circle4.getId());
        System.out.println("Max Radius now:" + Circle.getMaxRadius());
        System.out.println("Sum Area now:" + Circle.getSumArea());
        System.out.println();


        System.out.println("After create circle 5:");
        Circle circle5 = new Circle(10);
        System.out.println("Id:" + circle5.getId());
        System.out.println("Max Radius now:" + Circle.getMaxRadius());
        System.out.println("Sum Area now:" + Circle.getSumArea());
        System.out.println();
    }
}
