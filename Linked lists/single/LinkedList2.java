public class LinkedList2 {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) { // constructor to create a node
            data = d;
            next = null;
        }
    }

    public void front(int d) {
        Node node = new Node(d); // create a node and put in data
        node.next = head; // make next of new node as head
        head = node; // make the new node as head
    }

    public void between(Node prev_node, int b) {
        if (prev_node == null) {
            System.out.println("Previous node can't be null");
            return;
        } else {
            Node node = new Node(b);
            node.next = prev_node.next; // make link of new node as the link of prev node
            prev_node.next = node; // link prev node to next node.
        }
    }

    public void end(int e) {
        Node node = new Node(e);
        if (head == null) {
            head = new Node(e); // if empty LL, make new node as head.
            return;
        }
        node.next = null;
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
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
        LinkedList2 llist = new LinkedList2();

        llist.head = new Node(1);
        Node sec = new Node(3);
        Node third = new Node(5);
        Node four = new Node(7);

        llist.head.next = sec;
        sec.next = third;
        third.next = four;

        llist.printList(); // 1 -> 3 -> 5 -> 7 -> null

        llist.front(9);
        llist.printList(); // 9 -> 1 -> 3 -> 5 -> 7 -> null

        llist.between(sec, 17);
        llist.printList(); // 9 -> 1 -> 3 -> 17 -> 5 -> 7 -> null

        llist.end(11);
        llist.printList(); // 9 -> 1 -> 3 -> 17 -> 5 -> 7 -> 11 -> null
    }
}
