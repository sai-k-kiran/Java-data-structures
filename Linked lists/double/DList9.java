// Remove duplicates from a sorted doubly linked list

class DList9 {
    Node head;

    class Node {
        int data;
        Node next, prev;
    }

    public void push(int new_data) {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = head;
        new_node.prev = null;

        if (head != null) {
            head.prev = new_node;
        }
        head = new_node;
    }

    public void removeDuplicates(Node head) {
        if (head == null) {
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.data == current.next.data) {
                deleteNode(head, current.next);
            } else {
                current = current.next;
            }
        }
    }

    public void deleteNode(Node head, Node del) {
        if (head == null || del == null) {
            return;
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
    }

    public void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.print("head \n");
    }

    public static void main(String[] args) {
        DList9 dlist = new DList9();

        dlist.push(3);
        dlist.push(4);
        dlist.push(5);
        dlist.push(5);
        dlist.printList(dlist.head);

        dlist.removeDuplicates(dlist.head);
        dlist.printList(dlist.head);
    }
}
