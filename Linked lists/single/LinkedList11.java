// Find data of Nth node from backwards

public class LinkedList11 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public int getLength(int x) {
        int count = 0;
        Node n = head;

        while (n != null) {
            n = n.next;
            count++;
        }
        if (count < x)
            return 0;

        n = head;
        for (int i = 1; i < count - x + 1; i++) {
            n = n.next;
        }
        return n.data;
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public static void main(String[] args) {
        LinkedList11 llist = new LinkedList11();

        llist.push(2);
        llist.push(4);
        llist.push(6);
        llist.push(8);
        llist.push(10);
        llist.push(12);
        llist.push(12);

        System.out.println(llist.getLength(5));
    }
}
