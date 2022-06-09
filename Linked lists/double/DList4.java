// A Java program to swap kth node from the beginning with kth node from the end

class DList4 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println("");
    }

    int countNodes() {
        int count = 0;
        Node s = head;
        while (s != null) {
            count++;
            s = s.next;
        }
        return count;
    }

    void swapKth(int k) {

        int n = countNodes();

        if (n < k)
            return;

        if (2 * k - 1 == n)
            return;

        Node x = head;
        Node x_prev = null;
        for (int i = 1; i < k; i++) {
            x_prev = x;
            x = x.next;
        }

        Node y = head;
        Node y_prev = null;
        for (int i = 1; i < n - k + 1; i++) {
            y_prev = y;
            y = y.next;
        }

        if (x_prev != null)
            x_prev.next = y;

        if (y_prev != null)
            y_prev.next = x;

        Node temp = x.next;
        x.next = y.next;
        y.next = temp;

        if (k == 1)
            head = y;

        if (k == n)
            head = x;
    }

    public static void main(String[] args) {
        DList4 llist = new DList4();
        for (int i = 8; i >= 1; i--)
            llist.push(i);

        llist.printList();

        llist.swapKth(3);
        llist.printList();

        // for (int i = 1; i < 3; i++) {
        // llist.swapKth(i);
        // llist.printList();
        // }
    }
}
