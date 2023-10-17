
public class genericMethods {
    public static <T> void display(T[] arr) {
        System.out.println("type of array : " + arr.getClass().getSimpleName());
        System.out.println("elements : ");
        for (T ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static <T extends Number> double findAverage(T[] arr) {
        double sum = 0;
        for (T ele : arr) {
            sum += ele.doubleValue();
        }
        return sum / (double) arr.length;
    }
}
