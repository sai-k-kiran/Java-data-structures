// Delete a Doubly Linked List node at a given position

public class DList7 {
    static Node head;

    static class Node {
        int data;
        Node next, prev;
    }

    static Node deleteNode(Node del) {
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
        del = null;
        return head;
    }

    static void deleteNodeAtGivenPos(int n) {
        if (head == null || n <= 0) {
            return;
        }
        Node curr = head;
        for (int i = 1; i < n; i++) {
            curr = curr.next;
        }
        if (curr == null) {
            return;
        }
        deleteNode(curr);
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
    }

    static void push(int new_data) {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.prev = null;
        new_node.next = head;
        if (head != null)
            head.prev = new_node;

        head = new_node;
    }

    static void printList() {
        Node temp = head;
        if (temp == null)
            System.out.print("Doubly Linked list empty");

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // DList7 dlist = new DList7(); no need coz every method is static

        // dlist.push(5); if push() wasn't static then this would have the correct way.
        push(5);
        push(2);
        push(4);
        push(8);
        push(10);

        printList(); // printList() method is declared static so no need to cerate an object

        deleteNodeAtGivenPos(5);
        printList();
    }
}
