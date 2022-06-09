public class LinkedList {
    Node head; // head of list

    static class Node { // LL node. static so that main() can access it. LL node
        int data;
        Node next;

        Node(int d) { // constructor to create a node
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList(); // empty list

        llist.head = new Node(1); // node 1
        Node second = new Node(2); // node 2
        Node third = new Node(3); // node 3

        llist.head.next = second; // link head node to second node

        second.next = third; // link second node to third node
    }
}
