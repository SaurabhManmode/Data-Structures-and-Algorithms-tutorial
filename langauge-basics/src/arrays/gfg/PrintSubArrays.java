package arrays.gfg;

public class PrintSubArrays {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3};
        printSubarray(arr);


    }

    private static void printSubarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
