package arrays.gfg.hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UnionOfArray {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1};
        int[] b = {3, 2, 2, 3, 3, 2};

        ArrayList<Integer> res = findUnionOfArray(a, b);
        System.out.println(res);

    }

    private static ArrayList<Integer> findUnionOfArray(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : a) {
            set.add(num);
        }
        for (int num : b) {
            set.add(num);
        }

        for (int num : set) {
            list.add(num);
        }
        return list;
    }
}
