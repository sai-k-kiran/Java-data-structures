// Circular Singly Linked List | Insertion of node at end

public class CList6 {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void endInsert(int data) {
        Node new_node = new Node(data);

        if (head == null) {
            head = new_node;
            new_node.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = new_node;
            new_node.next = head;
        }
    }

    public void addAfter(Node head, int data, int item) {
        Node temp, p;
        p = head.next;

        do {
            if (p.data == item) {
                temp = new Node(data);
                temp.next = p.next;
                p.next = temp;

                if (p == head)
                    head = temp;
            }
            p = p.next;
        } while (p != head.next);
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
        CList6 list = new CList6();

        list.head = new Node(12);
        list.head.next = new Node(56);
        list.head.next.next = new Node(2);
        list.head.next.next.next = new Node(11);
        list.head.next.next.next.next = list.head;

        list.printList(list.head);

        list.endInsert(21);

        System.out.println("\n");
        list.printList(list.head);

        list.addAfter(list.head, 7, 2);

        System.out.println("\n");
        list.printList(list.head);
    }
}
