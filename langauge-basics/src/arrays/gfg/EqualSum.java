package arrays.gfg;

public class EqualSum {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 0, 4};
        int[] res = findSplit(arr);

        System.out.println(res[0] + " " + res[1]);
    }

    static int[] findSplit(int[] arr) {
        int[] res = new int[2];
        int n = arr.length;
        int resIndx = 0;
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += arr[i];

            if (total % 3 != 0) {
                res[0] = -1;
                res[0] = -1;
                return res;
            }
        }

        int currSum = 0;
        for (int i = 0; i < n; i++) {
            currSum += arr[i];

            if (currSum == total / 3) {
                currSum = 0;
                res[resIndx++] = i;

                if (resIndx == 2 && i < n - 1) {
                    return res;
                }
            }
        }
        res[0] = -1;
        res[1] = -1;
        return res;

    }
}
