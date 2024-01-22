package array.shift;

import java.util.Arrays;

public class Shift {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        int[] newArr = new int[arr.length - 1];

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            } else if (i < index) {
                newArr[i] = arr[i];
            } else {
                newArr[i - 1] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArr));
    }
}
