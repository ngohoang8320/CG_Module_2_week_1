import java.util.Scanner;

public class JoinArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of array_1: ");
        int length_1 = input.nextInt();
        System.out.print("Enter the length of array_2: ");
        int length_2 = input.nextInt();

        int[] array_1 = new int[length_1];
        int[] array_2 = new int[length_2];

        for (int i = 0; i < length_1; i++) {
            System.out.print("Enter the array_1[" + i + "]: ");
            array_1[i] = input.nextInt();
        }

        for (int i = 0; i < length_2; i++) {
            System.out.print("Enter the array_2[" + i + "]: ");
            array_2[i] = input.nextInt();
        }

        System.out.println("The array_1: ");
        for (int i = 0; i < length_1; i++) {
            System.out.print(array_1[i] + "\t");
        }
        System.out.println();
        System.out.println("The array_2: ");
        for (int i = 0; i < length_2; i++) {
            System.out.print(array_2[i] + "\t");
        }
        System.out.println();

        int[] newArray = new int[length_1 + length_2];

        newArray = joinArray(newArray, array_1, array_2);

        System.out.println("The array after join is: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + "\t");
        }
    }

    public static int[] joinArray(int[] nArray, int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            nArray[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            nArray[i + arr1.length] = arr2[i];
        }
        return nArray;
    }
}
