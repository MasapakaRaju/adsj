
public class BoxObjectDemo {
    public static void main(String[] args) {
        BoxObject b1 = new BoxObject("one");
        BoxObject b2 = new BoxObject(10);

        System.out.println(b1);
        System.out.println(b2);

        // manipulation
        String sval = (String) b1.getData();// type casting is must to manipulate data in Object
        sval = sval.toUpperCase();
        b1.setData(sval);
        System.out.println(b1);

        int ival = (int) b2.getData();
        ival += 10;
        b2.setData(ival);
        System.out.println(b2);

        // assigning
        b2 = b1;
        ival = (int) b2.getData();// mismatched class exception not caught at
        // compilation time
        // b2.setData(ival);
    }

}
