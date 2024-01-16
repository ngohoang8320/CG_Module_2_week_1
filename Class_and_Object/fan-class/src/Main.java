public class Main {
    public static void main(String[] args) {
        FanClass fan_1 = new FanClass();
        FanClass fan_2 = new FanClass();

        fan_1.setOn(true);
        fan_1.setSpeed(3);
        fan_1.setRadius(10);
        fan_1.setColor("yellow");
        System.out.println((fan_1.toString()));
        System.out.println();

        fan_2.setOn(false);
        fan_2.setSpeed(2);
        fan_2.setRadius(5);
        fan_2.setColor("blue");
        System.out.println((fan_2.toString()));
    }
}