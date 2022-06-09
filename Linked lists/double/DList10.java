// Delete all occurrences of a given key in a doubly linked list

class DList10 {
    Node head;

    static class Node {
        int data;
        Node next, prev;
    }

    static Node push(Node head, int new_data) {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = head;
        new_node.prev = null;

        if (head != null) {
            head.prev = new_node;
        }
        head = new_node;
        return head;
    }

    static Node delAllOccurOfGivenKey(Node head, int x) {
        if (head == null) {
            return null;
        }
        Node current = head;
        Node nextC = null;

        while (current != null) {
            if (current.data == x) {
                nextC = current.next;
                head = deleteNode(head, current);
                current = nextC;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    static Node deleteNode(Node head, Node del) {
        if (head == null || del == null) {
            return null;
        }
        if (head == del) {
            head = del.next;
        }
        if (del.next != null) {
            del.next.prev = del.prev;
        }
        if (del.prev != null) {
            del.prev.next = del.next;
        }
        return head;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.print("head \n");
    }

    public static void main(String[] args) {
        Node head = null;

        head = push(head, 2);
        head = push(head, 5);
        head = push(head, 2);
        head = push(head, 4);
        head = push(head, 8);
        head = push(head, 10);
        head = push(head, 2);
        head = push(head, 2);

        System.out.println("Original Doubly linked list: ");
        printList(head);

        head = delAllOccurOfGivenKey(head, 2);
        printList(head);
    }
}
