package arrays.gfg.twopointers;

import java.util.HashSet;
import java.util.Set;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        int target = -2;
        boolean isPairExists = twoSum(arr, target);
        System.out.println(isPairExists);
    }

    private static boolean twoSum(int[] arr, int target) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (set.contains(complement)) {
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}
