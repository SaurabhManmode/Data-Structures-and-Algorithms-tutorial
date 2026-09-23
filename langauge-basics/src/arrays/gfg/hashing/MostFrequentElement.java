package arrays.gfg.hashing;

import java.util.HashMap;

public class MostFrequentElement {

    public static void main(String[] args) {
        int[] arr = {40, 50, 30, 40, 50, 30, 30};
        System.out.println(mostFreqEle(arr));
    }

    private static int mostFreqEle(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int maxCount = 0;
        int res = -1;

        for (var entry : map.entrySet()) {
            int value = entry.getKey();
            int count = entry.getValue();

            if (maxCount < count || (count == maxCount && value > res)) {
                res = value;
                maxCount = count;
            }
        }
        return res;
    }
}
