// Split a Circular Linked List into two halves

public class CList2 {
    Node head, head1, head2;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void splitList() {
        Node slow = head;
        Node fast = head;

        if (head == null) {
            return;
        }

        while (fast.next != head && fast.next.next != head) { // 1
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast.next.next == head) { // 2
            fast = fast.next;
        }

        head1 = head;

        if (head.next != head) {
            head2 = slow.next;
        }
        fast.next = slow.next;
        slow.next = head;
    }

    public void printList(Node head) {
        Node n = head;

        if (n != null) {
            do {
                System.out.print(n.data + " ");
                n = n.next;
            } while (n != head);
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        CList2 list = new CList2();

        // Created linked list will be 12->56->2->11
        list.head = new Node(12);
        list.head.next = new Node(56);
        list.head.next.next = new Node(2);
        list.head.next.next.next = new Node(11);
        list.head.next.next.next.next = list.head;

        list.printList(list.head);

        // Split the list
        list.splitList();

        System.out.print("First Circular List -> ");
        list.printList(list.head1);

        System.out.print("Second Circular List -> ");
        list.printList(list.head2);
    }
}

// Algorithm
// In splitList()
// first we are setting two nodes "fast" & "slow" as head of LL (i.e 12)

// Then we are checking if fast.next and fast.next.next != head.
// If condition satisfies, then fast = fast.next.next (i.e fast = 2)
// slow = slow.next (i.e slow = 56)
// Check for the condition and when it resolves to false, break out of while
// loop

// Now see if fast.next.next = head. If its true, set fast = fast.next (i.e fast
// = 11)

// Now set class variable "head1" = head (i.e head1 = 12)

// If head.next != head, set head2 = slow.next (i.e head2 = 2)

// set fast.next = slow.next (i.e 11 -> 2)

// set slow.next = head (i.e 56 -> 12)