// Rotate Doubly linked list by N nodes

public class DList12 {
    static Node head;

    static class Node {
        char data;
        Node prev;
        Node next;
    }

    static void rotate(int x) {

        if (x == 0) {
            return;
        }
        Node n = head;

        int count = 1;
        while (count < x) {
            n = n.next; // n = to-be-last node
            count++;
        }
        Node last = n;
        while (last.next != null) {
            last = last.next; // last node
        }

        last.next = head;
        head.prev = last;
        head = n.next;
        head.prev = null;
        n.next = null;
    }

    static void push(char new_data) {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.prev = null;
        new_node.next = (head);
        if ((head) != null)
            (head).prev = new_node;
        head = new_node;
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " <=> ");
            node = node.next;
        }
        System.out.print("null \n");
    }

    public static void main(String[] args) {
        push('e');
        push('d');
        push('c');
        push('b');
        push('a');

        printList(head);

        rotate(4);
        printList(head);
    }
}
