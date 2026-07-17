package arrays.gfg;

import java.util.Arrays;

public class HoarePartition {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2, 7, 1, 10};
        hoarePartition(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void hoarePartition(int[] arr) {
        int n = arr.length;
        int pivot = arr[0];

        int i = -1;
        int j = n;

        while (true) {

            do {
                i++;
            } while (arr[i] < pivot);

            do {
                j--;
            } while (arr[j] > pivot);

            if (i > j) break;

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
