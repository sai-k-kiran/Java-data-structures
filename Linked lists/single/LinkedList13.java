// Count the no. of times an integer occurs in a LL.

public class LinkedList13 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void counts(int integer) {
        Node n = head;
        int count = 0;

        while (n != null) {
            if (n.data == integer) {
                count++;
            }
            n = n.next;
        }
        System.out.println(integer + " occurs " + count + " times.");
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public static void main(String[] args) {
        LinkedList13 llist = new LinkedList13();

        llist.push(2);
        llist.push(4);
        llist.push(6);
        llist.push(8);
        llist.push(10);
        llist.push(12);
        llist.push(12);
        llist.push(15);

        llist.counts(15);
    }
}
