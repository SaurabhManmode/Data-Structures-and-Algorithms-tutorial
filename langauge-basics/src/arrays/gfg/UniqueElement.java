package arrays.gfg;

import java.util.HashMap;
import java.util.Map;

public class UniqueElement {


    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 5, 3, 4};
        int uniqueElement = findUnique(arr);
        System.out.println(uniqueElement);
        int uniqueEl2 = findUnique2(arr);
        System.out.println(uniqueEl2);
    }

    private static int findUnique(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res ^= arr[i];
        }
        return res;
    }

    private static int findUnique2(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(map);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
