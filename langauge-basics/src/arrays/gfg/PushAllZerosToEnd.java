package arrays.gfg;

import java.util.Arrays;

public class PushAllZerosToEnd {

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 5, 0, 4, 3, 0, 9};

        pushAllZerosToEnd(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void pushAllZerosToEnd(int[] arr) {
        int n = arr.length - 1;
        int idx = 0;
        for (int i = 0; i <= n; i++) {
            if (arr[i] != 0) {
                arr[idx++] = arr[i];

            }
        }

        while (idx <= n) {
            arr[idx++] = 0;

        }
    }
}
