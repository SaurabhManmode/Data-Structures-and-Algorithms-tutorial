package arrays.gfg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReorderArray {

    public static void main(String[] args) {
        int[] arr = {10, 11, 12};
        int[] index = {1, 0, 2};

        reorderArray(arr, index);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void reorderArray(int[] arr, int[] index) {
        List<int[]> paired = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            paired.add(new int[]{index[i], arr[i]});
        }

        Collections.sort(paired, (a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < arr.length; i++) {
            arr[i] = paired.get(i)[1];
        }
    }
}
