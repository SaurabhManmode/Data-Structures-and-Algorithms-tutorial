package algorithmcomplexity;

public class ConstantTime {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 0};
        int x = arr[3]; // constant time no matter what array size is
        System.out.println(x);
    }
}
