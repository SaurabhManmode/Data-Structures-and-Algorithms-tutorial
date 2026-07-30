package arrays.gfg.twopointers;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {
        int[] arr = {1, 0, 4, 0, 5, 0, 3, 6};
        moveZeroToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void moveZeroToEnd(int[] arr) {
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[idx++] = arr[i];
            }

        }

        while (idx < arr.length) {
            arr[idx++] = 0;
        }
    }
}
