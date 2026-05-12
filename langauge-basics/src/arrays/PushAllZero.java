package arrays;

import java.util.Arrays;

public class PushAllZero {

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 3, 4, 5, 0, 0};
        pushAllZero(arr);
        System.out.println( Arrays.toString(arr));

    }

    private static void pushAllZero(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}
