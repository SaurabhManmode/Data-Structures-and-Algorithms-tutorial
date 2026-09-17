package arrays.gfg.hashing;

import java.util.HashMap;

public class MaxDistanceBetweenTwoOccurances {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 1};
        System.out.println(maxDistance(arr));
    }

    private static int maxDistance(int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!mp.containsKey(arr[i])) {
                mp.put(arr[i], i);
            } else {
                res = Math.max(res, i - mp.get(arr[i]));
            }
        }
        return res;

    }
}
