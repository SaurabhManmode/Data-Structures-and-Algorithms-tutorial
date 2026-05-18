package arrays.striver;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class UnionArray {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 2, 3, 3, 3, 4};
        int arr2[] = {1, 2, 3, 4, 5};

        int union[] = findUnion(arr1, arr2);

        System.out.println(Arrays.toString(union));
    }

    private static int[] findUnion(int[] arr1, int[] arr2) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        int union[] = new int[set.size()];
        int j = 0;
        for (int i : set) {
            union[j] = i;
            j++;
        }
        return union;
    }
}
