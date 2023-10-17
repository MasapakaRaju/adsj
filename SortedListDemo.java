
public class SortedListDemo {
    public static void main(String[] args) {
        SortedList<Integer> ilist = new SortedList<>();
        ilist.add(10);
        ilist.add(5);
        ilist.add(2);
        ilist.add(3);
        ilist.add(22);
        ilist.add(20);
        ilist.display();

        SortedList<String> sList = new SortedList<>();
        sList.add("c");

        sList.add("a");
        sList.add("b");
        sList.add("n");
        sList.display();
    }
}
