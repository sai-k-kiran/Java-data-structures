// Java program to exchange first and last node in circular linked list
class CList9 {

    static class Node {
        int data;
        Node next;
    };

    static Node addToEmpty(Node head, int data) {
        if (head != null) {
            return head;
        }

        Node temp = new Node();
        temp.data = data;
        head = temp;
        head.next = head;
        return temp;
    }

    static Node addBegin(Node head, int data) {
        if (head == null)
            return addToEmpty(head, data);

        Node temp = new Node();

        temp.data = data;
        temp.next = head.next;
        head.next = temp;
        return head;
    }

    static void traverse(Node head) {
        Node p;

        if (head == null) {
            System.out.print("List is empty.");
            return;
        }

        p = head;
        do {
            System.out.print(p.data + " ");
            p = p.next;
        } while (p != head);
    }

    static Node exchangeNodes(Node head) {
        if (head.next.next == head) { // For only two nodes
            head = head.next;
            return head;
        }

        Node p = head;
        while (p.next.next != head)
            p = p.next;
        p.next.next = head.next;
        head.next = p.next;
        p.next = head;
        head = head.next;

        return head;
    }

    public static void main(String args[]) {
        int i;
        Node head = null;
        head = addToEmpty(head, 6);

        for (i = 5; i > 0; i--)
            head = addBegin(head, i);
        System.out.print("List Before: ");
        traverse(head);
        System.out.println();

        System.out.print("List After: ");
        head = exchangeNodes(head);
        traverse(head);
    }
}
// p = head(ie p = 6)
// fisrt traverse the LL and set p as second last node (i.e p = 4)
// Connect the last node to second node (5 -> 1)
// Connect head node to last node(6 -> 5)
// Connect p to head (4 -> 6 -> 5 -> 1 -> 2 -> 3)
// Make node after head as head(5 -> 1 -> 2 -> 3 -> 4 -> 6)