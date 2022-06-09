// A function to delete a Linked List

class LinkedList5 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void deleteList() {
        head = null;
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
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
        LinkedList5 llist = new LinkedList5();

        llist.push(2);
        llist.push(4);
        llist.push(6);
        llist.push(8);

        llist.printList(); // 8 -> 6 -> 4 -> 2 -> null

        llist.deleteList();
        llist.printList(); // null
    }
}
