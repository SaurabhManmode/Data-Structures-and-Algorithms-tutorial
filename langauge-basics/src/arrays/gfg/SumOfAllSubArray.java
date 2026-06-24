package arrays.gfg;

public class SumOfAllSubArray {

    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 3, 2};

        int sum = sumOfSubArray(arr);
        System.out.println(sum);
    }

    private static int sumOfSubArray(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = i; j < arr.length; j++) {
                temp += arr[j];
                sum += temp;
            }
        }
        return sum;
    }
}
