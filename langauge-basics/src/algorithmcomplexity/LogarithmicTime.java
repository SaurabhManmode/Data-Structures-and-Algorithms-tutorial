package algorithmcomplexity;


public class LogarithmicTime {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 5;
        int index = binarySearch(arr, target);
        System.out.println(index);
    }

    public static int binarySearch(int arr[], int target) {
        int lo = 0;
        int high = arr.length - 1;

        while (lo <= high) {
            int mid = lo + (high - lo) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                lo = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
