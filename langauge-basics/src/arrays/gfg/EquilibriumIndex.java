package arrays.gfg;

public class EquilibriumIndex {

    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 3};
        int theEquilibrium = findTheEquilibrium(arr);
        System.out.println(theEquilibrium);

    }

   private static int findTheEquilibrium(int arr[]) {


        int totalSum = 0;
        int prefSum = 0;
        for (int ele : arr) {
            totalSum += ele;
        }


        for (int pivot = 0; pivot < arr.length; pivot++) {
            int suffixSum = totalSum - prefSum - arr[pivot];
            if (prefSum == suffixSum) {
                return pivot;
            }
            prefSum += arr[pivot];
        }
        return -1;
    }
}
