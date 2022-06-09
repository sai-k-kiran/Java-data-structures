// Recursive Java program to search an element in linked list

public class LinkedList9 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public boolean search(Node head, int x) {
        if (head == null) {
            return false;
        } else if (head.data == x) {
            return true;
        } else
            return search(head.next, x);
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public static void main(String[] args) {
        LinkedList9 llist = new LinkedList9();

        llist.push(2);
        llist.push(4);
        llist.push(6);
        llist.push(8);
        llist.push(10);
        llist.push(12);
        llist.push(12);

        if (llist.search(llist.head, 5)) {
            System.out.println("Yes");
        } else
            System.out.println("No");
    }
}
