package experimenal;

public class seperateChaining<K, V> {
    private Node head;
    private Node<K, V>[] hTable;
    private int size;
    private int n;

    private class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        public Node(K data, V value, Node next) {
            this.key = data;
            this.value = value;
            this.next = next;
        }
    }

    public seperateChaining(int capacity) {
        hTable = new Node[capacity];
        this.size = capacity;
    }

    public seperateChaining() {
        hTable = (Node[]) new Object[10];
        size = 10;
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public V get(K key) {
        int h;
        int k = (Integer) key;
        h = k % size;
        Node t = hTable[h];
        while (t != null) {
            if (t.key.equals(key)) {
                V val = (V) t.value;
                return val;
            }
            t = t.next;
        }
        return null;
    }

    public boolean put(K val1, V val2) {
        int index = ((int) val1 % size);
        if (index < hTable.length) {
            hTable[index] = null;
            return true;
        } else
            return false;
    }
}
