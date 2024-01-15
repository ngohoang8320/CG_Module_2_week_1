import java.util.Scanner;

public class Min2dArray {
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

        int min = findMin(numbersArray);
        System.out.print("The min number is: " + min);
    }

    public static int findMin(int[][] arr) {
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
}
