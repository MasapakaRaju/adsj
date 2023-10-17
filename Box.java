
public class Box<T> {
    private T data;

    public Box() {
    }

    public Box(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String toString() {
        return "[ data = " + data + " type = " + data.getClass().getSimpleName() + " ]";
    }
}
