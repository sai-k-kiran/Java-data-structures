public class LinkedList1 {
    Node head; // head of list

    static class Node { // LL node. static so that main() can access it.
        int data;
        Node next;

        Node(int d) { // constructor to create a node
            data = d;
            next = null;
        }
    }

    public void printList() {
        Node n = head; // Node n is set as the head(first) node.
        while (n != null) { // if head node is null then that means linked list is empty
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        LinkedList1 llist = new LinkedList1(); // empty list

        llist.head = new Node(3); // node 1
        Node second = new Node(7); // node 2
        Node third = new Node(2); // node 3

        llist.head.next = second; // link head node to second node

        second.next = third; // link second node to third node

        llist.printList(); // 3 -> 7 -> 2 -> null
    }
}
