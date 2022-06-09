// Given only a reference to a node to be deleted in a singly linked list, 
// how do you delete it?

public class LinkedList17 {
    Node head; // head of the list

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void push(int new_data) {
        Node new_Node = new Node(new_data);
        new_Node.next = head;
        head = new_Node;
    }

    public void printList() {
        Node tNode = head;
        while (tNode != null) {
            System.out.print(tNode.data + " -> ");
            tNode = tNode.next;
        }
        System.out.print("null \n");
    }

    public void deleteNode(Node n) {
        Node temp = n.next;
        n.data = temp.data;
        n.next = temp.next;
        temp = null;
    }

    public static void main(String[] args) {
        LinkedList17 llist = new LinkedList17();

        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);

        llist.printList();

        llist.deleteNode(llist.head);

        llist.printList();
    }
}
