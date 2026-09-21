package arrays.gfg.hashing;

import java.util.ArrayList;
import java.util.HashSet;

public class InterSectOfArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1};
        int[] b = {3, 2, 2, 3, 3, 2};

        ArrayList<Integer> res = intersectOfArray(a, b);

        for (int val : res) {
            System.out.print(val + " ");
        }
    }

    private static ArrayList<Integer> intersectOfArray(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : a) {
            set.add(num);
        }
        ArrayList<Integer> res = new ArrayList<>();

        for (int num : b) {
            if (set.contains(num)) {
                res.add(num);
                set.remove(num);
            }
        }
        return res;
    }
}
