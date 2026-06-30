package arrays.gfg;

import java.util.ArrayList;
import java.util.List;

public class MissingAndRepeatating {

    public static void main(String[] args) {
        int[] arr = {3, 1, 3};
        List<Integer> ans = findTwoElement(arr);
        System.out.println(ans);
    }

    private static List<Integer> findTwoElement(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int n = arr.length;
        int sum = n * (n + 1) / 2;
        int sumOfsquare = (n * (n + 1) * (2 * n + 1)) / 6;
        int missing = 0;
        int repeatating = 0;

        for (int i = 0; i < n; i++) {
            sum -= arr[i];
            sumOfsquare -= arr[i] * arr[i];
        }

        missing = (sum + sumOfsquare / sum) / 2;
        repeatating = missing - sum;
        list.add(missing);
        list.add(repeatating);
        return list;


    }
}
