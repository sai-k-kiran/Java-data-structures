// Check if a linked list is Circular Linked List

public class CList4 {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static boolean isCircular(Node head) {
        if (head == null)
            return true;

        Node node = head.next;

        while (node != null && node != head) {
            node = node.next;
        }

        return (node == head);
    }

    static Node newNode(int data) {
        Node new_node = new Node(data);
        new_node.next = null;
        return new_node;
    }

    public static void main(String args[]) {
        Node head = newNode(1);
        head.next = newNode(2);
        head.next.next = newNode(3);
        head.next.next.next = newNode(4);

        System.out.print(isCircular(head) ? "Yes\n" : "No\n");

        head.next.next.next.next = head;

        System.out.print(isCircular(head) ? "Yes\n" : "No\n");

    }
}
