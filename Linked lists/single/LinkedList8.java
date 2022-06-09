// Iterative Java program to search an element in linked list

public class LinkedList8 {
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
        Node current = head;

        while (current != null) {
            if (current.data == x) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public static void main(String[] args) {
        LinkedList8 llist = new LinkedList8();

        llist.push(2);
        llist.push(4);
        llist.push(6);
        llist.push(8);
        llist.push(10);
        llist.push(12);
        llist.push(12);

        if (llist.search(llist.head, 21)) {
            System.out.println("Yes");
        } else
            System.out.println("No");
    }
}
