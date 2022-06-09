// Detect and remove loop (DONE BY ME!)
public class LinkedList16 {
    Node head;

    class Node {
        int data;
        Node next;
        int flag;

        Node(int d) {
            data = d;
            next = null;
            flag = 0;
        }
    }

    public void push(int d) {
        Node new_node = new Node(d);
        new_node.next = head;
        head = new_node;
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

    public void removeLoop() {
        Node temp = null;

        while (head != null) {
            if (head.flag == 1) {
                temp.next = null;
                break;
            } else {
                head.flag = 1;
                temp = head;
                head = head.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList16 llist = new LinkedList16();

        llist.push(12);
        llist.push(3);
        llist.push(6);
        llist.push(1);
        llist.push(19);

        llist.head.next.next.next = llist.head;

        llist.detectLoop();

        llist.removeLoop();
        llist.detectLoop();
    }
}
// In removeLoop(), traverse the list and set the flag of every visited node as
// 1.
// If a node is encountered again (by checking if flag == 1), then set the next
// of its
// previous node as null.
// temp is used to store the previous node coz head will move to the next node
// break out of the loop after setting the next as null otherwise it will be
// stuck in
// the loop