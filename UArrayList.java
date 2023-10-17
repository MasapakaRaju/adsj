
public class UArrayList<T> {
    private T[] arr;
    private int size = 0;

    public UArrayList() {
        this.arr = (T[]) new Object[10];
    }

    public UArrayList(T[] arr) {
        this.arr = arr;
        size = arr.length;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(T ele) {
        if (size < arr.length)
            arr[size++] = ele;
    }

    public void addIndex(T ele, int index) {
        if (size < arr.length)
            for (int i = size - 1; i >= index; i--) {
                arr[i + 1] = arr[i];
            }
        arr[index] = ele;
        size++;
    }

    public T remove(T ele) {
        if (isEmpty() || !contains(ele))
            return null;
        else {
            int index = indexOf(ele);
            T temp = arr[index];
            for (int i = index; i < size; i++)
                arr[i] = arr[i + 1];
            return temp;
        }
    }

    public int indexOf(T ele) {
        for (int i = 0; i < size; i++)
            if (arr[i] == ele)
                return i;
        return -1;
    }

    public boolean contains(T ele) {
        if (size == 0)
            return false;
        else {
            for (int i = 0; i < size; i++) {
                if (arr[i] == ele)
                    return true;
            }
            return false;
        }
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
