package arrays.gfg;

import java.util.ArrayList;
import java.util.List;

public class PrintAlternateElements {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        List<Integer> list = printAlternatenums(arr, 0);
        System.out.println(list);

    }

    private static List<Integer> printAlternatenums(int[] arr, int idx) {
        ArrayList<Integer> res = new ArrayList<>();
        getAlternatesRec(arr, 0, res);
        return res;
    }

    private static void getAlternatesRec(int[] arr, int idx, ArrayList<Integer> res) {
        if (idx < arr.length) {
            res.add(arr[idx]);
            getAlternatesRec(arr, idx + 2, res);
        }
    }


}
