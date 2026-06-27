package arrays.gfg;

public class UniqueElement {


    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 5, 3, 4};
        int uniqueElement = findUnique(arr);
        System.out.println(uniqueElement);
    }

    private static int findUnique(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res ^= arr[i];
        }
        return res;
    }
}
