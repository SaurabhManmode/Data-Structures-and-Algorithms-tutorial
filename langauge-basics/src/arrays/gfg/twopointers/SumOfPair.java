package arrays.gfg.twopointers;

import java.util.Arrays;

public class SumOfPair {

    public static void main(String[] args) {
        int[] arr = {10, 20, 35, 50};
        int target = 70;
        int[] indexes = findThePair(arr, target);
        System.out.println(Arrays.toString(indexes));
    }

    private static int[] findThePair(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
    }
}
