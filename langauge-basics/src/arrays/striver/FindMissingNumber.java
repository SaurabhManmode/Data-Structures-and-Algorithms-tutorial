package arrays.striver;

public class FindMissingNumber {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = 5;

        int missing = findMissingNum(arr, n);
        System.out.println(missing);

        // optimal
        int missingNum2 = findMissingNum2(arr, n);
        System.out.println(missingNum2);
    }

    private static int findMissingNum2(int[] arr, int n) {
        int actualSum = n * (n + 1) / 2;
        int realSum = 0;
        for (int i = 0; i < arr.length; i++) {
            realSum += arr[i];
        }

        return actualSum - realSum;
    }

    private static int findMissingNum(int[] arr, int n) {
        for (int i = 1; i <= n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] == i) {
                    flag = true;
                    break;
                }
            }

            if (flag == false) {
                return i;
            }
        }
        return -1;
    }
}
