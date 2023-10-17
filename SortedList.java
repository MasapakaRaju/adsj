
public class SortedList<T extends Comparable<T>> {
    private class Node {
        T data;
        Node next;

        Node(T data, Node ref) {
            this.data = data;
            this.next = ref;
        }

    }

    private Node head;

    public void add(T ele) {
        if (head == null)
            head = new Node(ele, head);
        else if (ele.compareTo(head.data) < 0)
            head = new Node(ele, head);
        else {
            Node ptemp = null;
            Node temp = head;
            while (temp != null) {
                if (ele.compareTo(temp.data) < 0)
                    break;
                ptemp = temp;
                temp = temp.next;
            }
            ptemp.next = new Node(ele, temp);

        }

    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
