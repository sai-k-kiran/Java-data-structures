// Find Nth node at the middle if odd no of nodes & second middle if even no. nodes

public class LinkedList12 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void middle() {
        Node n = head;
        int count = 0;

        while (n != null) {
            count++;
            n = n.next;
        }
        if (count % 2 != 0) {
            n = head;
            for (int i = 1; i < count / 2 + 1; i++) {
                n = n.next;
            }
            System.out.println(n.data);
        } else if (count % 2 == 0) {
            n = head;
            for (int i = 1; i < count / 2 + 1; i++) {
                n = n.next;
            }
            System.out.println(n.data);
        }
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public static void main(String[] args) {
        LinkedList12 llist = new LinkedList12();

        llist.push(2);
        llist.push(4);
        llist.push(6);
        llist.push(8);
        llist.push(10);
        llist.push(12);
        llist.push(12);
        llist.push(15);

        llist.middle(); // odd = 8, even = 8
    }
}
