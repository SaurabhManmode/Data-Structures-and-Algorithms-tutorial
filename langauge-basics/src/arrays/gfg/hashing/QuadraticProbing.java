package arrays.gfg.hashing;

import java.util.Arrays;

public class QuadraticProbing {

    public static void main(String[] args) {
        int[] arr = {50, 700, 76, 85, 92, 73, 101};
        int tsize = 11;
        int[] table = new int[tsize];
        Arrays.fill(table, -1);
        quadprobing(table, tsize, arr);
        for (int val : table) {
            System.out.print(val + " ");
        }
    }

    private static void quadprobing(int[] table, int tsize, int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int hv = arr[i] % tsize;
            if (table[hv] == -1) {
                table[hv] = arr[i];
            } else {
                for (int j = 1; j <= tsize; j++) {
                    int t = (hv + j * j) % tsize;
                    if (table[t] == -1) {
                        table[t] = arr[i];
                        break;
                    }
                }
            }
        }
    }
}
