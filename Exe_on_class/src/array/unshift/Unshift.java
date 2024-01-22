package array.unshift;

import java.util.Arrays;

public class Unshift {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        int[] newArr = new int[arr.length + 1];

        newArr[newArr.length / 2] = 11;

        for (int i = 0; i < newArr.length; i++) {
            if (i < arr.length / 2) {
                newArr[i] = arr[i];
            } else if (i > arr.length / 2) {
                newArr[i] = arr[i - 1];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArr));
    }
}
