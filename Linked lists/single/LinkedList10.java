// Java program to find Nth node from 0 position in linked list iteratively

public class LinkedList10 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public int getNth(int index) {
        Node n = head;
        int count = 0;

        while (n != null) {
            if (count == index)
                System.out.print("Nth data: " + n.data);
            n = n.next;
            count++;
        }
        return 0;
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public static void main(String[] args) {
        LinkedList10 llist = new LinkedList10();

        llist.push(2);
        llist.push(4);
        llist.push(6);
        llist.push(8);
        llist.push(10);
        llist.push(12);
        llist.push(12);

        llist.getNth(4);
    }
}
