package arrays.gfg.twopointers;

import java.util.Arrays;

public class RemoveOccurances {

    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 4, 5, 6, 2, 2};
        int ele = 2;
        int count = removeOccurances(arr, ele);
        System.out.println(count);
        System.out.println(Arrays.toString(arr));
    }

    private static int removeOccurances(int[] arr, int ele) {

        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ele) {
                swapEl(arr, i, k);
                k++;
            }
        }
        return k;
    }

    private static void swapEl(int[] arr, int i, int k) {
        int temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
    }
}
