package arrays.gfg;

public class DuplicateWithinKDistance {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 2, 3, 4};
        int k = 3;
        boolean isDuplicatePresent = findDuplicatePresent(arr, k);
        System.out.println(isDuplicatePresent);
    }

    private static boolean findDuplicatePresent(int[] arr, int k) {

        for (int i = 0; i < arr.length; i++) {
            for (int c = 1; c <= k && (i + c) < arr.length; c++) {
                int j = i + c;
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
