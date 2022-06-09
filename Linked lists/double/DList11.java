public class DList11 {
    static Node head, tail;

    static class Node {
        int data;
        Node prev, next;
    }

    static void insetail(int key) {
        Node n = new Node();
        n.data = key;
        n.next = null;

        if (head == null) {
            head = n;
            tail = n;
            head.prev = null;
            return;
        }
        if (n.data < head.data) {
            n.prev = null;
            head.prev = n;
            n.next = head;
            head = n;
            return;
        }
        if (n.data > tail.data) {
            n.next = null; // no need
            n.prev = tail;
            tail.next = n;
            tail = n;
            return;
        }

        Node temp = head.next;
        while (temp.data < n.data) {
            temp = temp.next;
        }
        temp.prev.next = n;
        n.prev = temp.prev;
        temp.prev = n;
        n.next = temp;
    }

    static void printList(Node temp) {
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    public static void main(String args[]) {
        head = tail = null;
        insetail(23);
        insetail(42);
        insetail(37);
        insetail(16);
        insetail(45);
        insetail(64);

        System.out.println("Doubly linked list on printing from left to right");
        printList(head);
    }
}
