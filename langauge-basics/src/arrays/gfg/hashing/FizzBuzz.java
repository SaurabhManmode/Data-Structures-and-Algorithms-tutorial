package arrays.gfg.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class FizzBuzz {

    public static void main(String[] args) {
        int n = 20;
        ArrayList<String> res = fizzBuzz(n);
        for (String s : res) {
            System.out.print(s + " ");
        }

    }

    private static ArrayList<String> fizzBuzz(int n) {
        ArrayList<String> res = new ArrayList<>();
        HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "Fizz");
        map.put(5, "Buzz");
        int[] divisors = {3, 5};
        for (int i = 1; i <= n; i++) {
            StringBuilder s = new StringBuilder();
            for (int d : divisors) {
                if (i % d == 0) {
                    s.append(map.get(d));
                }
            }
            if (s.length() == 0) {
                s.append(i);
            }
            res.add(s.toString());
        }
        return res;
    }
}
