public class DList1 {
    Node head;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int d) {
            data = d;
            // next and prev are by default null
        }
    }

    public void addBegin(int d) {
        Node new_node = new Node(d);

        new_node.next = head;
        new_node.prev = null;

        if (head != null) {
            head.prev = new_node;
        }
        head = new_node;
    }

    public void insertBefore(Node next_node, int data) {
        if (next_node == null) {
            System.out.println("The given next node can not be NULL");
            return;
        }
        Node new_node = new Node(data);
        new_node.prev = next_node.prev;
        next_node.prev = new_node;
        new_node.next = next_node;

        if (new_node.prev != null) {
            new_node.prev.next = new_node;
        } else
            head = new_node;
    }

    public void insertAfter(Node prev_node, int data) {
        if (prev_node == null) {
            System.out.println("The given prev node can not be NULL");
            return;
        }
        Node new_node = new Node(data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
        new_node.prev = prev_node;

        if (new_node.next != null) {
            new_node.next.prev = new_node;
        }
    }

    public void append(int new_data) {
        Node new_node = new Node(new_data);

        Node last = head;
        new_node.next = null;

        if (head == null) {
            new_node.prev = null;
            head = new_node;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = new_node;
        new_node.prev = last;
    }

    public void traverse(Node head) {
        Node last = null;
        System.out.println("Traversal in forward Direction");

        while (head != null) {
            System.out.print(head.data + " -> ");
            last = head;
            head = head.next;
        }
        System.out.println();
        System.out.println("Traversal in reverse direction");

        while (last != null) {
            System.out.print(last.data + " <- ");
            last = last.prev;
        }
    }

    public static void main(String[] args) {
        DList1 dlist = new DList1();

        dlist.addBegin(3);
        dlist.addBegin(5);
        dlist.addBegin(7);
        dlist.addBegin(9);

        dlist.traverse(dlist.head);
        System.out.println(" ");

        dlist.insertBefore(dlist.head.next.next, 6);
        dlist.traverse(dlist.head);
        System.out.println(" ");

        dlist.insertAfter(dlist.head.next.next.next, 4);
        dlist.traverse(dlist.head);
        System.out.println(" ");

        dlist.append(1);
        dlist.traverse(dlist.head);
        System.out.println(" ");
    }
}
