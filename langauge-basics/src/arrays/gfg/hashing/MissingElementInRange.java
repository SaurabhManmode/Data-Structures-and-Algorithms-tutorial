package arrays.gfg.hashing;

import java.util.HashSet;

public class MissingElementInRange {

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 6};
        System.out.println(countNum(arr));
    }

    private static int countNum(int[] arr) {

        HashSet<Integer> hashSet = new HashSet<>();
        int maxm = Integer.MIN_VALUE;
        int minm = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            hashSet.add(arr[i]);
            if (arr[i] < minm) {
                minm = arr[i];
            }
            if (arr[i] > maxm) {
                maxm = arr[i];
            }
        }

        return (maxm - minm + 1) - hashSet.size();
    }
}
