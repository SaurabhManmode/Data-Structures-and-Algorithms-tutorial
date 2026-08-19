package arrays.gfg.hashing;

import java.util.ArrayList;
import java.util.List;

public class SimpleChaining {
    public static void main(String[] args) {
        int[] keys = {7, 18, 12, 25};
        Hash hashTable = new Hash(7);
        for (int key : keys) {
            hashTable.insert(key);
        }
        hashTable.remove(12);
        hashTable.display();
    }
}

class Hash {
    private int bucketCount;
    private List<List<Integer>> table; //[[]]

    public Hash(int buckets) {
        bucketCount = buckets;
        table = new ArrayList<>();
        for (int i = 0; i < bucketCount; i++) {
            table.add(new ArrayList<>());
        }
    }

    public void insert(int key) {
        int index = getHashIndex(key);
        table.get(index).add(key);
    }

    public void remove(int key) {
        int index = getHashIndex(key);
        table.get(index).remove(Integer.valueOf(key));
    }

    public void display() {
        for (int i = 0; i < bucketCount; i++) {
            System.out.println(i);
            for (int key : table.get(i)) {
                System.out.println(" --> " + key);
            }
            System.out.println();
        }
    }

    private int getHashIndex(int key) {
        return key % bucketCount;
    }
}