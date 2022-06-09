// Java program to count number of nodes in a linked list recursively

public class LinkedList7 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public int countLength(Node h) {
        if (h == null) {
            return 0;
        } else {
            return 1 + countLength(h.next);
        }

    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public static void main(String[] args) {
        LinkedList7 llist = new LinkedList7();

        llist.push(2);
        llist.push(4);
        llist.push(6);
        llist.push(8);
        llist.push(10);
        llist.push(12);
        llist.push(12);

        System.out.print("Length of linked list is: " + llist.countLength(llist.head));
    }
}
