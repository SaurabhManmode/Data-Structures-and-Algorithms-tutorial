package arrays.gfg;


public class MakeIncrementByKToMakeEqual {

    public static void main(String[] args) {
        int[] arr = {4, 7, 19, 16};
        int k = 3;
        int max = findMax(arr);

        int ops = findOps(max, arr, k);
        System.out.println(ops);

    }

    private static int findOps(int max, int[] arr, int k) {
        int ops = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((max - arr[i]) % k != 0) {
                return -1;
            } else {
                ops += (max - arr[i]) / k;
            }
        }
        return ops;
    }

    private static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
