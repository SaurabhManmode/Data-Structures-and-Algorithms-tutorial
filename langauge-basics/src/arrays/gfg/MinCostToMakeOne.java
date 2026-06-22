package arrays.gfg;

public class MinCostToMakeOne {
    public static void main(String[] args) {
        int arr[] = {2, 4, 3};
        int cost = minimumCost(arr);
        System.out.println(cost);
    }


    private static int minimumCost(int[] arr) {
        int min = arr[0];
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return (n - 1) * min;
    }
}
