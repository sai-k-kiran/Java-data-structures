public class CList8 {
    static class Node {
        int data;
        Node next;

        public Node(int d) {
            this.data = d;
        }
    }

    static void getJosephusPosition(int m, int n) {
        Node head = new Node(1);
        Node prev = head;
        for (int i = 2; i <= n; i++) {
            prev.next = new Node(i);
            prev = prev.next;
        }
        prev.next = head;
        Node ptr1 = head, ptr2 = head;

        while (ptr1.next != ptr1) {
            int count = 1;
            while (count != m) {
                ptr2 = ptr1;
                ptr1 = ptr1.next;
                count++;
            }
            ptr2.next = ptr1.next;
            ptr1 = ptr2.next;
        }
        System.out.println("Last person left standing " +
                "(Josephus Position) is " + ptr1.data);
    }

    static int josephus(int n, int k) {
        if (n == 1)
            return 1;
        else
            return (josephus(n - 1, k) + k - 1) % n + 1;
    }

    public static void main(String args[]) {
        int n = 4, m = 3;
        getJosephusPosition(m, n);

        System.out.println("The chosen place is "
                + josephus(n, m));
    }
}
