// Insert value in sorted way in a sorted doubly linked list

public class Dlist6 {
    static class Node {
        int data;
        Node next, prev;
    }

    static Node createNode(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.prev = newNode.next = null;
        return newNode;
    }

    static Node insertNode(Node head, Node new_node) {
        Node current;

        if (head == null) {
            head = new_node;
        } else if (head.data >= new_node.data) {
            new_node.next = head;
            new_node.next.prev = new_node;
            head = new_node;
        } else {
            current = head;

            while (current.next != null && current.next.data < new_node.data) {
                current = current.next; // current points to the node less than new_node
            }

            new_node.next = current.next;

            if (current.next != null) {
                new_node.next.prev = new_node;
            }
            current.next = new_node;
            new_node.prev = current;
        }
        return head;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node head = null;

        Node new_node = createNode(6);
        head = insertNode(head, new_node);
        new_node = createNode(4);
        head = insertNode(head, new_node);
        new_node = createNode(7);
        head = insertNode(head, new_node);
        new_node = createNode(2);
        head = insertNode(head, new_node);
        new_node = createNode(1);
        head = insertNode(head, new_node);

        printList(head);
    }
}
