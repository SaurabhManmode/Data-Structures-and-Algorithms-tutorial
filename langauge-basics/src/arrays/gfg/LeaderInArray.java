package arrays.gfg;

import java.util.ArrayList;
import java.util.List;

public class LeaderInArray {

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        List<Integer> leaders = findLeaders(arr);
        System.out.println(leaders);
    }

    private static List<Integer> findLeaders(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        int right = arr[arr.length - 1];

        leaders.add(right);

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] >= right) {
                right = arr[i];
                leaders.add(arr[i]);
            }
        }
        return leaders.reversed();
    }
}
