
public class genericMethodsDemo {
    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        String[] sarr = { "one", "two", "three" };
        genericMethods.display(arr);
        System.out.println("average of array : " + genericMethods.findAverage(arr));
        genericMethods.display(sarr);
        // genericMethods.findAverage(sarr);//the gen method findAverage only takes
        // numeric value parameters
    }
}
