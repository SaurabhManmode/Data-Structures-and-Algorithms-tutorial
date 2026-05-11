package arrays;

import java.util.Arrays;

public class LeftRotateArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int d = 3;
        int n = arr.length;

        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArray(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
