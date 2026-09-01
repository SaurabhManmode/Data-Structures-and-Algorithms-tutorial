package arrays.gfg.hashing;

import java.util.HashSet;
import java.util.Set;

public class CheckSubset {

    public static void main(String[] args) {
        int[] a = {11, 1, 13, 21, 3, 7};
        int[] b = {11, 3, 7, 1};
        isSubset(a, b);
    }

    private static boolean isSubset(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        for (int num : a) {
            set.add(num);
        }

        for (int num : b) {
            if (!set.contains(num)) {
                return false;
            }
        }
        return true;
    }
}
