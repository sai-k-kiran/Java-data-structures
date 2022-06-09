class CList9s {
    static class Node {
        int data;
        Node next;
    }

    static Node addToEmpty(Node head, int data) {
        if (head != null) {
            return head;
        }

        Node temp = new Node();
        temp.data = data;
        head = temp;
        temp.next = temp;
        return temp;
    }

    static Node addBegin(Node head, int data) {
        if (head == null) {
            return addToEmpty(head, data);
        }

        Node temp = new Node();
        temp.data = data;
        temp.next = head.next;
        head.next = temp;
        return head;
    }

    static void traverse(Node head) {
        if (head == null) {
            System.out.println("List is empty");
        }
        Node p = head;
        do {
            System.out.print(p.data + " -> ");
            p = p.next;
        } while (p != head);
    }

    static Node exchangeNode(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node p = head;
        while (p.next != head) {
            p = p.next;
        }
        int temp = p.data; // data of last node
        p.data = head.data;
        head.data = temp;
        return head;
    }

    public static void main(String[] args) {
        int i;
        Node head = null;
        head = addToEmpty(head, 9);

        for (i = 8; i > 3; i--)
            head = addBegin(head, i);

        System.out.print("List Before: ");
        traverse(head);
        System.out.println();

        System.out.print("List After: ");
        head = exchangeNode(head);
        traverse(head);

    }
}
