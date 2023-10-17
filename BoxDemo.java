
public class BoxDemo {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>(10);
        System.out.println(b1);
        Box<String> b2 = new Box<>("one");
        System.out.println(b2);

        System.out.println();

        // manipulation
        int ival = b1.getData();
        ival += 10;
        b1.setData(ival);
        System.out.println(b1);

        String sval = b2.getData();
        sval = sval.toUpperCase();
        b2.setData(sval);
        System.out.println(b2);

        // assignment
        // b1=b2;//error shown at compilation time
    }
}
