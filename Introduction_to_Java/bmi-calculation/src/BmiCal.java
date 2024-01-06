import java.util.Scanner;

public class BmiCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the weight: ");
        float weight = scanner.nextFloat();
        System.out.print("Enter the height: ");
        float height = scanner.nextFloat();

        float bmi = (float) (weight / Math.pow(height, 2)); // Math.pow has change the data type to double

        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18.5) {
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        } else if (bmi < 25) {
            System.out.printf("%-20.2f%s", bmi, "Normal");
        } else if (bmi < 30) {
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        } else {
            System.out.printf("%-20.2f%s", bmi, "Obese");
        }
    }
}
