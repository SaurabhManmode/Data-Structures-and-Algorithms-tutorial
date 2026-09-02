package arrays.gfg.hashing;

import java.util.HashSet;
import java.util.Set;

public class CheckDisjoint {

    public static void main(String[] args) {
        int[] a = {12, 34, 11, 9, 3};
        int[] b = {7, 2, 1, 5};

        boolean disjoint = checkDisjoint(a, b);
        System.out.println(disjoint);
    }

    private static boolean checkDisjoint(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        for (int num : a) {
            set.add(num);
        }
        for (int num : b) {
            if (set.contains(num)) {
                return false;
            }
        }
        return true;

    }
}
