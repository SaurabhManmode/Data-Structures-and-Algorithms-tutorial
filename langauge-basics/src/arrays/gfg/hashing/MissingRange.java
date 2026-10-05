package arrays.gfg.hashing;

import java.util.ArrayList;
import java.util.HashSet;

public class MissingRange {

    public static void main(String[] args) {
        int[] arr = {1, 4, 11, 51, 15};
        int low = 50, high = 55;
        ArrayList<Integer> res
                = missingRange(arr, low, high);

        System.out.print("[");

        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i));
            if (i != res.size() - 1)
                System.out.print(", ");
        }

        System.out.print("]");
    }

    private static ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr) {
            set.add(x);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int x = low; x <= high; ++x) {
            if (!set.contains(x)) {
                list.add(x);
            }
        }
        return list;
    }
}
