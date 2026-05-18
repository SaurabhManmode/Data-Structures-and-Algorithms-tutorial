package arrays.striver;

public class LargestInArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int largest = findLargestElement(arr);
        System.out.println(largest);
    }

    private static int findLargestElement(int[] arr) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }
        return largest;
    }
}
