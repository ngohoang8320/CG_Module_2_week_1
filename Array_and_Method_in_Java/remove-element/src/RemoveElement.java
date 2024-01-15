import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numberArray = {10, 4, 6, 7, 8, 6, 15, 20, 25};
        for (int i = 0; i < numberArray.length; i++) {
            System.out.print(numberArray[i] + "\t");
        }
        System.out.println();


//        int number = 8;

        System.out.println("Enter the number you want to remove: ");

        int number = scanner.nextInt();

        int[] newArray = remove(numberArray, number);

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + "\t");
        }
    }

    public static int[] remove(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == num) {
//                int rmNum = 0;
                arr[i] = 0;
                for (int j = i; j < arr.length - 1; j++) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        return arr;
    }
}
