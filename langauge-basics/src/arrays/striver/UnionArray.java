package arrays.striver;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class UnionArray {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 2, 3, 3, 3, 4};
        int arr2[] = {1, 2, 3, 4, 5};

        int union[] = findUnion(arr1, arr2);

        Set<Integer> union2 = findUnion2(arr1, arr2);

        System.out.println(Arrays.toString(union));

        System.out.println(union2);
    }

    private static Set<Integer> findUnion2(int[] arr1, int[] arr2) {

        int i = 0;
        int j = 0;

        Set<Integer> set = new TreeSet<>();

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] <= arr2[j]) {
                set.add(arr1[i]);
                i++;
            } else {
                set.add(arr2[j]);
                j++;
            }
        }

        // Remaining elements of arr1
        while (i < arr1.length) {
            set.add(arr1[i]);
            i++;
        }

        // Remaining elements of arr2
        while (j < arr2.length) {
            set.add(arr2[j]);
            j++;
        }

        return set;


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
