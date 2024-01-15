import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the row: ");
        int row = input.nextInt();
        System.out.print("Enter the column: ");
        int col = input.nextInt();

        int[][] numbersArray = new int[row][col];
        System.out.println("Create an array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter the element[" + i + "][" + j + "]: ");
                numbersArray[i][j] = input.nextInt();
            }
        }
        System.out.println();

        System.out.println("The array: ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(numbersArray[i][j] + "\t");
            }
            System.out.println();
        }

        int max = findMax(numbersArray);
        System.out.print("The max number is: " + max);
    }

    public static int findMax(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
