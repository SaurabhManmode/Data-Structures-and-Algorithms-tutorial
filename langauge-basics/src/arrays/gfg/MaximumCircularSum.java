package arrays.gfg;

public class MaximumCircularSum {

    public static void main(String[] args) {
        int[] arr = {8, -8, 9, -9, 10, -11, 12};

        int maxSum = maxCircularSum(arr);
        System.out.println(maxSum);
    }

    private static int maxCircularSum(int[] arr) {
        int n = arr.length;
        int res = arr[0];

        for (int i = 0; i < n; i++) {
            int currSum = 0;
            for (int j = 0; j < n; j++) {
                int idx = (i + j) % n;
                currSum = currSum + arr[idx];
                res = Math.max(res, currSum);
            }
        }
        return res;
    }
}
