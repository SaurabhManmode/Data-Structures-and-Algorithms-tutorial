package arrays.gfg.hashing;

import java.util.HashMap;

public class AbsoluteDifferencePair {


    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 4, 5};
        int k = 3;

        System.out.println(countPairsDifference(arr, k));
    }

    private static int countPairsDifference(int[] arr, int k) {

        int n = arr.length;
        HashMap<Integer, Integer> freq = new HashMap<>();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (freq.containsKey(arr[i] + k)) {
                cnt += freq.get(arr[i] + k);
            }

            if (freq.containsKey(arr[i] - k)) {
                cnt += freq.get(arr[i] - k);
            }

            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }

        return cnt;
    }
}
