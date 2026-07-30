package arrays.gfg.twopointers;

import java.util.Arrays;

public class UniqueElementsInArray {

    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 2, 2};
        uniqueElementInArray(arr);

    }

    private static int uniqueElementInArray(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return n;
        }
        int idx = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[idx++] = arr[i];
            }
        }
        return idx;
    }
}
