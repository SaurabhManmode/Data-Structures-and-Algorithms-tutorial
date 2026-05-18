package arrays.striver;

public class SmallestInArray {


    public static void main(String[] args) {
        int[] arr = {1, 2, 34, 5, 6, 9};

        int smallest = smallestNum(arr);
        System.out.println(smallest);
    }

    private static int smallestNum(int[] arr) {

        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest)
                smallest = arr[i];
        }
        return smallest;
    }
}
