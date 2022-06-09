public class CList7 {
    static class Node {
        int data;
        Node next;
    }

    static Node push(Node head, int data) {
        Node new_node = new Node();
        new_node.data = data;
        new_node.next = head;

        if (head != null) {
            Node temp = head;

            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = new_node; // To point the last to the new node
        } else
            new_node.next = new_node;
        head = new_node;
        return head;
    }

    static void printList(Node head) {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            } while (temp != head);
        }
        System.out.print("head \n");
    }

    static Node deleteNode(Node head, int key) {

        if (head == null) {
            return null;
        }
        Node prev = new Node();
        Node curr = head;

        while (curr.data != key) {
            if (curr.next == head) {
                System.out.println("The given key is not in the list");
                break;
            }
            prev = curr;
            curr = curr.next;
        }

        // If there is only head node in LL, then delete it
        if (curr == head && curr.next == head) {
            head = null;
            return head;
        }
        // To delete the given node. 1
        if (curr == head) {
            prev = head;
            while (prev.next != head) {
                prev = prev.next;
            }
            head = curr.next;
            prev.next = head;
        } else if (curr.next == head) {
            prev.next = head;
        } else {
            prev.next = curr.next;
        }
        return head;
    }

    public static void main(String args[]) {
        Node head = null;

        head = push(head, 2);
        head = push(head, 5);
        head = push(head, 7);
        head = push(head, 8);
        head = push(head, 10);

        System.out.printf("List Before Deletion: ");
        printList(head);

        head = deleteNode(head, 2);

        System.out.printf("List After Deletion: ");
        printList(head);
    }
}

// We know that we can make any node as head node in circular LL unlike singly
// LL in which
// the first node is the head node.

// In 1, we are making the node we want to delete as the head node and we are
// checking if
// curr == head(i.e the given node).

// Now traverse the LL and set prev as the node just before the given node(5 in
// this ex).
// Set head as the node after teh given node(5 in this ex). Now set the next of
// prev as
// head. So 8 -> 5. The given node will be deleted.