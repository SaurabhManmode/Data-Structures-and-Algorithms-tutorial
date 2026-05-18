package arrays.striver;

public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 7, 8};
        int secondLargest = secondLargestNum(arr);
        System.out.println(secondLargest);
    }

    private static int secondLargestNum(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
