package arrays.gfg.hashing;

public class LinearProbingOpenChaining {


    public static void main(String[] args) {
        HashMap h = new HashMap();
        h.insertNode(1, 1);
        h.insertNode(2, 2);
        h.insertNode(2, 3);
        h.display();
       /* System.out.println(h.sizeOfMap());
        System.out.println(h.deleteNode(2));
        System.out.println(h.sizeOfMap());
        System.out.println(h.isEmpty());
        System.out.println(h.get(2));*/
    }
}

class HashNode {
    int key;
    int value;

    public HashNode(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class HashMap {
    HashNode[] arr;
    int capacity;
    int size;
    HashNode dummy;

    public HashMap() {
        capacity = 20;
        size = 0;
        arr = new HashNode[capacity];
        dummy = new HashNode(-1, -1);
    }

    int hashCode(int key) {
        return key % capacity;
    }

    //insert key value pair
    void insertNode(int key, int value) {
        HashNode temp = new HashNode(key, value);
        int hashIndex = hashCode(key);
        while (arr[hashIndex] != null &&
                arr[hashIndex].key != key &&
                arr[hashIndex].key != -1
        ) {
            hashIndex++;
            hashIndex %= capacity;
        }
        if (arr[hashIndex] == null || arr[hashIndex].key == -1) {
            size++;

        }
        arr[hashIndex] = temp;
    }

    //delete by key
    int deleteNode(int key) {
        int hashIndex = hashCode(key);
        while (arr[hashIndex] != null) {
            if (arr[hashIndex].key == key) {
                HashNode temp = arr[hashIndex];
                arr[hashIndex] = dummy;
                size--;
                return temp.value;
            }
            hashIndex++;
            hashIndex %= capacity;
        }
        return -1;
    }

    //get value by key

    int get(int key) {
        int hashIndex = hashCode(key);
        int counter = 0;
        while (arr[hashIndex] != null) {
            if (counter++ > capacity) {
                return -1;
            }
            if (arr[hashIndex].key == key) {
                return arr[hashIndex].value;
            }
            hashIndex++;
            hashIndex %= capacity;
        }
        return -1;
    }

    int sizeOfMap() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void display() {
        for (int i = 0; i < capacity; i++) {
            if (arr[i] != null && arr[i].key != -1) {
                System.out.println(arr[i].key +
                        " " + arr[i].value);
            }
        }
    }
}