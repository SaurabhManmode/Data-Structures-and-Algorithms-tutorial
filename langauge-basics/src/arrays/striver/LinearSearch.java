package arrays.striver;

public class LinearSearch {

    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5, 6, 7};
        int target = 4;
// first occurance
        int idx = findNumber(arr, target);
        System.out.println(idx);

    }

    private static int findNumber(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
