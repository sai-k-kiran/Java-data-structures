// Java program to find n'th node in linked list using recursion

public class LinkedList10s {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public int getNth(Node n, int x) {
        int count = 0;

        if (count == x) {
            return n.data;
        }
        return getNth(n.next, x - 1); // Instead of incremneting count, decrease x in each iteration
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public static void main(String[] args) {
        LinkedList10s llist = new LinkedList10s();

        llist.push(2);
        llist.push(4);
        llist.push(6);
        llist.push(8);
        llist.push(10);
        llist.push(12);
        llist.push(12);

        System.out.println(llist.getNth(llist.head, 3));
    }
}
