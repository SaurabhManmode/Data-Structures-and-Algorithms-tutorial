package arrays.gfg;

import java.util.Arrays;

public class RightRotateArrayByD {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};

        int d = 2;

        rightRotateArray(arr, d);
        System.out.println(Arrays.toString(arr));
    }

    private static void rightRotateArray(int[] arr, int d) {

        int n = arr.length;

        for (int i = 0; i < d; i++) {

            int last = arr[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }


    }
}
