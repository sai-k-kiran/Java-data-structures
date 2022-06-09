// Sorted insert for circular linked list

public class CList3 {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void sortedInsert(Node new_node) {
        Node current = head;

        if (current == null) {
            new_node.next = new_node;
            head = new_node;
        } else if (current.data >= new_node.data) {
            while (current.next != head) {
                current = current.next; // current now points to last node
            }
            current.next = new_node; // last node -> new node
            new_node.next = head; // new node -> head -> ... -> last node
            head = new_node;
        } else {
            while (current.next != head && current.next.data < new_node.data) {
                current = current.next; // current points to node less than new node
            }

            new_node.next = current.next; // new node -> current.next
            current.next = new_node; // current node -> new node -> current.next
        }
    }

    public void printList() {
        Node n = head;
        if (n != null) {
            do {
                System.out.print(n.data + " ");
                n = n.next;
            } while (n != head);
        }
    }

    public static void main(String[] args) {
        CList3 list = new CList3();
        CList3 list2 = new CList3();

        list.head = new Node(2);
        list.head.next = new Node(5);
        list.head.next.next = new Node(8);
        list.head.next.next.next = new Node(20);
        list.head.next.next.next.next = list.head;

        Node sai = new Node(22);

        list.printList();
        System.out.println("\n");
        list.sortedInsert(sai);

        System.out.print("New List: ");
        list.printList();

        int arr[] = { 12, 5, 23, 9, 15, 2 };

        Node temp = null;

        for (int i = 0; i < arr.length; i++) {
            temp = new Node(arr[i]);
            list2.sortedInsert(temp);
        }
        System.out.println("\n");
        list2.printList();
    }
}
