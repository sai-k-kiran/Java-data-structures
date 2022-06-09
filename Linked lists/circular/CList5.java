// Circular Singly Linked List | Insertion of node at beginning

public class CList5 {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void beginInsert(int data) {
        Node new_node = new Node(data);

        if (head == null) {
            head = new_node;
            new_node.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next; // temp becomes the last node
            }
            temp.next = new_node;
            new_node.next = head;
            head = new_node;
        }
    }

    public void printList(Node head) {
        Node n = head;

        if (n != null) {
            do {
                System.out.print(n.data + " ");
                n = n.next;
            } while (n != head);
        }
    }

    public static void main(String[] args) {
        CList5 list = new CList5();

        list.head = new Node(12);
        list.head.next = new Node(56);
        list.head.next.next = new Node(2);
        list.head.next.next.next = new Node(11);
        list.head.next.next.next.next = list.head;

        list.printList(list.head);

        list.beginInsert(21);

        System.out.println("\n");
        list.printList(list.head);
    }
}
