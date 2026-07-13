package arrays.gfg;

import java.util.Arrays;

public class NaivePartition {

    public static void main(String[] args) {
        int[] arr = {5, 13, 6, 9, 12, 11, 8};
        naivePartition(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void naivePartition(int[] arr) {
        int n = arr.length;
        int pivot = arr[n - 1];
        int[] temp = new int[n];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] <= pivot) {
                temp[idx++] = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > pivot) {
                temp[idx++] = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}
