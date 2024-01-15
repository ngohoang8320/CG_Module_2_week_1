import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numberArray = {10, 4, 6, 7, 8, 0, 0, 0, 0};
        for (int i = 0; i < numberArray.length; i++) {
            System.out.print(numberArray[i] + "\t");
        }
        System.out.println();

        System.out.println("Enter the number you want to insert and its index: ");
        System.out.print("Number: ");
        int number = scanner.nextInt();
        System.out.print("Index: ");
        int index = scanner.nextInt();

        int[] newArray = remove(numberArray, number, index);

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + "\t");
        }
    }

    public static int[] remove(int[] arr, int num, int index) {
        for (int i = 0; i < arr.length; i++)
            if (i == index) {
                for (int j = i; j < arr.length - 1; j += 2) {
                    int temp = arr[j];
                    arr[j] = num;
                    num = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        return arr;
    }
}
