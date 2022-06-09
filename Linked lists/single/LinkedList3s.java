public class LinkedList3s {
    Node head;

    static class Node {
        int data;
        Node next;
    }

    static Node delete(Node head, int key) {
        if (key < 1) {
            return head;
        }
        if (head == null) {
            return null;
        }
        if (key == 1) {
            Node res = head.next;
            System.out.println(head.data);
            return res;
        }
        head.next = delete(head.next, key - 1);
        return head;
    }

    static Node push(Node head_ref, int new_data) {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = head_ref;
        head_ref = new_node;
        return head_ref;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.print("null \n");
    }

    public static void main(String[] args) {
        Node llist = null;

        llist = push(llist, 7);
        llist = push(llist, 1);
        llist = push(llist, 3);
        llist = push(llist, 2);

        printList(llist);

        llist = delete(llist, 3);
        printList(llist);
    }
}
