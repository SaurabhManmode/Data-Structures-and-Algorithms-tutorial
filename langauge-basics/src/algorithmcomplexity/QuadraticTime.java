package algorithmcomplexity;

public class QuadraticTime {

    public static void main(String[] args) {
        int [] arr = {1,3,4,5,6,7};

        int square = nsquare(arr);
        System.out.println(square);
    }
    public static int nsquare(int[] a) {
        int n = a.length;

        int pairSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                pairSum += a[i] * a[j];
            }
        }

        return pairSum;
    }
}
