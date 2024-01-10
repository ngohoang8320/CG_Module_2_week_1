import java.util.Scanner;

public class PrintShape {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the triangle");
            System.out.println("3. Draw the isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw the rectangel");
                    for (int height = 1; height <= 8; height++) {
                        System.out.println();
                        for (int width = 1; width <= 10; width++) {
                            System.out.print('*');
                        }
                    }
                    System.out.println();
                    break;
                case 2:
                case 3:
                    for (int count = 1; count <= 5; count++) {
                        int star = count;
                        while (star >= 1) {
                            System.out.print('*');
                            star--;
                        }
                        System.out.println();
                    }
                    System.out.println();

                    for (int count = 5; count >= 1; count--) {
                        int star = count;
                        while (star >= 1) {
                            System.out.print('*');
                            star--;
                        }
                        System.out.println();
                    }
                    System.out.println();

                    for (int count = 5; count >= 1; count--) {
                        int blank = count - 1;
                        for (int i = blank; i > 0; i--) {
                            System.out.print(' ');
                        }
                        for (int star = 5 - blank; star >= 1; star--) {
                            System.out.print('*');
                        }
                        blank--;
                        System.out.println();
                    }
                    System.out.println();


                    for (int count_1 = 5; count_1 >= 1; count_1--) {
                        int blank_1 = 5 - count_1;

                        for (int i = blank_1; i > 0; i--) {
                            System.out.print(' ');
                        }

                        for (int star_1 = count_1; star_1 > 0; star_1--) {
                            System.out.print('*');
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
