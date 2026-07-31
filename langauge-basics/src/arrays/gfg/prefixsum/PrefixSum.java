package arrays.gfg.prefixsum;

import java.util.ArrayList;
import java.util.List;

public class PrefixSum {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        List<Integer> list = prefixSume(arr);
        System.out.println(list);
    }

    private static List<Integer> prefixSume(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += arr[j];

            }
            list.add(sum);
        }
        return list;
    }
}
