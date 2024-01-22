package array.push;

import java.util.Arrays;

public class Push {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        int[] newArr = new int[arr.length + 1];

        newArr[newArr.length - 1] = 11;
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArr));
    }

    /*public interface itf {
        public final int abc = 2;

        int fly();
    }*/
}
