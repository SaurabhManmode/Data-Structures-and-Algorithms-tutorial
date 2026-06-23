package arrays.gfg;

import java.util.Arrays;

public class WaveArray {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2};

        waveArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void waveArray(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {

            if (i % 2 == 0) {
                if (arr[i] > arr[i + 1]) {
                    swapPostion(arr, i, i + 1);
                }
            } else {
                if (arr[i] < arr[i + 1]) {
                    swapPostion(arr, i, i + 1);
                }
            }
        }
    }

    private static void swapPostion(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
