package arrays.gfg.hashing;

import java.util.HashSet;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        int target = -2;

        if (twoSumHashing(arr, target))
            System.out.println("true");
        else
            System.out.println("false");
    }

    private static boolean twoSumHashing(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

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
