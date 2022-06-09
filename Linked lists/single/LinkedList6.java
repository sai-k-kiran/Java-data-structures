// Java program to count number of nodes in a linked list iteratively

public class LinkedList6 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void countLength() {
        Node n = head;
        int count = 0;
        while (n != null) {
            count += 1;
            n = n.next;
        }
        System.out.print("Lenght of Linked List is: " + count);
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public static void main(String[] args) {
        LinkedList6 llist = new LinkedList6();

        llist.push(2);
        llist.push(4);
        llist.push(6);
        llist.push(8);
        llist.push(10);

        llist.countLength();
    }
}
