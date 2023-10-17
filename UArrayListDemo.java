
public class UArrayListDemo {
    public static void main(String[] args) {
        UArrayList<Integer> iArr = new UArrayList<>();
        System.out.println(iArr.isEmpty());
        iArr.add(1);
        iArr.add(5);
        iArr.addIndex(3, 1);
        iArr.display();
        System.out.println();
        System.out.println(iArr.size());
        System.out.println(iArr.indexOf(3));
        System.out.println(iArr.contains(5));
        System.out.println(iArr.contains(6));
        System.out.println(iArr.isEmpty());

    }
}
