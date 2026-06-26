package algorithmcomplexity;

public class LinearTime {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int max = findMaxElement(arr);

        System.out.println(max);
    }

    private static int findMaxElement(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
