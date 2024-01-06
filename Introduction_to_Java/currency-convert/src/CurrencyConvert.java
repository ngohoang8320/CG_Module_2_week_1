import java.util.Scanner;

public class CurrencyConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float rate = 23000;

        System.out.print("Enter USD: ");

        float money = scanner.nextFloat();

        System.out.printf("VND currency: %.2f VND", money * rate);
    }
}
