// Reverse a stack without using extra space in O(n)

class Stack14 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void push(int d) {
        if (head == null) {
            head = new Node(d);
            return;
        }
        Node s = new Node(d);
        s.next = head;
        head = s;
    }

    public Node pop() {
        Node s = head;
        head = head.next;
        return s;
    }

    public void display() {
        Node s = head;
        while (s != null) {
            System.out.print(s.data + " ");
            s = s.next;
        }
        System.out.println();
    }

    public void reverse() {
        Node prev, curr, succ;

        curr = prev = head;
        curr = curr.next;
        prev.next = null;

        while (curr != null) {
            succ = curr.next;
            curr.next = prev;
            prev = curr;
            curr = succ;
        }
        head = prev;
    }

    public static void main(String[] args) {
        Stack14 s = new Stack14();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("Original Stack");
        s.display();

        s.reverse();

        System.out.println("Reversed Stack");
        s.display();
    }

}
