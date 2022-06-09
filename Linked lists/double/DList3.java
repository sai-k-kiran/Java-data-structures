// Reverse a Doubly Linked List

public class DList3 {
    Node head;

    class Node {

        int data;
        Node next, prev;

        Node(int d) {
            data = d;
            next = prev = null;
        }
    }

    public void reverse() {
        Node temp = null;
        Node current = head;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.prev = null;
        new_node.next = head;

        if (head != null) {
            head.prev = new_node;
        }

        head = new_node;
    }

    public void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.print("head \n");
        System.out.println();
    }

    public static void main(String[] args) {
        DList3 dlist = new DList3();

        dlist.push(2);
        dlist.push(4);
        dlist.push(8);
        dlist.push(10);

        dlist.printList(dlist.head);

        dlist.reverse();
        dlist.printList(dlist.head);
    }
}
