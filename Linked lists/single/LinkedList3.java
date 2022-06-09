public class LinkedList3 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void delete(int key) {
        Node temp = head, prev = null;
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            return;
        }
        prev.next = temp.next;
    }

    public void push(int b) {
        Node node = new Node(b);
        node.next = head;
        head = node;
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
        LinkedList3 llist = new LinkedList3();

        llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(2);

        llist.printList();

        llist.delete(3); // Delete node with data 3
        llist.printList();
    }
}
