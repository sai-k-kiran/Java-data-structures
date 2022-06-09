// Delete a node in Doubly LL

public class DList2 {
    Node head;

    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int d) {
            data = d;
        }
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);

        new_node.next = head;
        new_node.prev = null;

        if (head != null) {
            head.prev = new_node;
        }
        head = new_node;
    }

    public void printList(Node head) {
        Node last = null;
        while (head != null) {
            System.out.print(head.data + " -> ");
            last = head;
            head = head.next;
        }
        System.out.print("head \n");
        System.out.println();
    }

    public void deleteNode(Node del) {
        if (head == null || del == null) {
            return;
        }
        if (head == del) { // If node to be deleted is head node
            head = del.next;
        }
        if (del.next != null) { // Change next only if del isnt last node
            del.next.prev = del.prev;
            // del.prev.next = del.next; You can't delete head node by this
        }
        if (del.prev != null) { // Change prev only if del isnt first node
            del.prev.next = del.next;
        }
    }

    public static void main(String[] args) {
        DList2 dlist = new DList2();
        dlist.push(1);
        dlist.push(3);
        dlist.push(5);
        dlist.push(7);
        dlist.push(9);

        dlist.printList(dlist.head);

        dlist.deleteNode(dlist.head);
        dlist.printList(dlist.head);
    }
}
