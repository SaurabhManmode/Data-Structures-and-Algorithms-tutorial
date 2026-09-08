package arrays.gfg.hashing;

import java.util.HashMap;
import java.util.Map;

public class CheckEquals {

    public static void main(String[] args) {
        int a[] = {3, 5, 2, 5, 2};
        int b[] = {2, 3, 5, 5, 2};
        System.out.println( checkEquals(a, b));
    }

    private static boolean checkEquals(int[] a, int[] b) {

        int n = a.length;
        int m = b.length;
        if (n != m) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (map.get(a[i]) == null) {
                map.put(a[i], 1);
            } else {
                count = map.get(a[i]);
                count++;
                map.put(a[i], count);
            }
        }

        for (int i = 0; i < n; i++) {
            if (!map.containsKey(b[i])) {
                return false;
            }
            if (map.get(b[i]) == 0) {
                return false;
            }

            count = map.get(b[i]);
            --count;
            map.put(b[i], count);
        }
        return true;
    }
}
