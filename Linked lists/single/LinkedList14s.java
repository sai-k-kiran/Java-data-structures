// Detect a loop using Floyd’s Cycle-Finding Algorithm in a LL

public class LinkedList14s {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void detectLoop() {
        Node slow = head, fast = head;
        int flag = 0;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Loop found");
        } else
            System.out.println("No loop");
    }

    public void push(int d) {
        Node new_node = new Node(d);
        new_node.next = head;
        head = new_node;
    }

    public void printList() {
        Node n = head;

        while (n != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.print("null \n");
    }

    public static void main(String[] args) {
        LinkedList14s llist = new LinkedList14s();

        llist.push(12);
        llist.push(3);
        llist.push(6);
        llist.push(1);
        llist.push(19);

        llist.head.next.next.next = llist.head; // 19 -> 1 -> 6 -> 19

        llist.detectLoop();
    }
}
