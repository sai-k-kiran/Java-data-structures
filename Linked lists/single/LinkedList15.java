// Java program to count number of nodes in loop in a linked list if loop is present

class LinkedList15 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static int countNodes(Node n) {
        int res = 1;
        Node temp = n;
        while (temp.next != n) {
            res++;
            temp = temp.next;
        }
        return res;
    }

    static int countNodesinLoop(Node head) {
        Node slow_p = head, fast_p = head;

        while (slow_p != null && fast_p != null && fast_p.next != null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;

            if (slow_p == fast_p)
                return countNodes(slow_p);
        }
        return 0;
    }

    static Node newNode(int key) {
        Node temp = new Node(key);
        return temp;
    }

    public static void main(String[] args) {
        Node head = newNode(1);
        head.next = newNode(2);
        head.next.next = newNode(3);
        head.next.next.next = newNode(4);
        head.next.next.next.next = newNode(5);

        head.next.next.next = head;

        System.out.println(countNodesinLoop(head));
    }
}