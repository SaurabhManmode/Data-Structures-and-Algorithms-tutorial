package arrays.gfg;

import java.util.Arrays;

public class RearrangeArray {

    public static void main(String[] args) {
        int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1}; // {-1,1,2,3,4,-1,6,-1,-1,9}

        modifyArray(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void modifyArray(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != -1 && arr[i] != arr[arr[i]]) {
                int temp = arr[i];
                arr[i] = arr[arr[i]];
                arr[temp] = temp;
            } else {
                i++;
            }
        }
    }
}
