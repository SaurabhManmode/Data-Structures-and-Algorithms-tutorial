package arrays.gfg.binarysearch;

public class BSTRecursive {

    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;
        int low = 0;
        int high = arr.length - 1;
        int index = findTargetIndexRec(arr, target, low, high);
        System.out.println(index);
    }

    private static int findTargetIndexRec(int[] arr, int target, int low, int high) {
        if (high >= low) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                return findTargetIndexRec(arr, target, low, mid - 1);
            }
            return findTargetIndexRec(arr, target, mid + 1, high);
        }
        return -1;
    }
}
