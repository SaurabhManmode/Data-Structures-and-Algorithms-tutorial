package arrays.gfg;

public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        int res = missingNum(arr);
        System.out.println(res);
    }

    private static int missingNum(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }
        return sum - actualSum;

    }
}
