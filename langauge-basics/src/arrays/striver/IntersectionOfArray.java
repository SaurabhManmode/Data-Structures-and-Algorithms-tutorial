package arrays.striver;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfArray {


    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 3, 4, 5, 6};
        int arr2[] = {1, 3, 3, 4, 6, 7, 8};

        List<Integer> list = findTheIntersection(arr1, arr2);

        List<Integer> theIntersection2 = findTheIntersection2(arr1, arr2);
        System.out.println(theIntersection2);

        System.out.println(list);
    }

    private static List<Integer> findTheIntersection2(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        List<Integer> list = new ArrayList<>();
        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;

            } else {
                list.add(arr1[i]);
                i++;
                j++;
            }
        }
        return list;
    }

    private static List<Integer> findTheIntersection(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();

        int visited[] = new int[arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j] && visited[j] == 0) {
                    list.add(arr1[i]);
                    visited[j] = 1;
                    break;
                }
            }

            if (arr2.length > arr1.length) {
                break;
            }
        }
        return list;
    }
}
