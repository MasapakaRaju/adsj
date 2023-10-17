
public class BoxObject {
    private Object data;

    public BoxObject() {
    }

    public BoxObject(Object data) {
        this.data = data;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String toString() {
        return "[ data = " + data + " type = " + data.getClass().getSimpleName() + " ]";
    }
}