// Implementing Stack using Linked List:

public class Stacks {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else
            return false;
    }

    public void push(int d) {
        Node new_node = new Node(d);

        if (head == null) {
            head = new_node;
        } else {
            Node temp = head;
            head = new_node;
            new_node.next = temp;
        }
        System.out.println(d + " pushed to stack");
    }

    public int pop() {
        int popped = Integer.MIN_VALUE;
        if (head == null) {
            System.out.println("Stack is Empty");
        } else {
            popped = head.data;
            head = head.next;
        }
        return popped;
    }

    public int peek() {
        if (head == null) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        } else {
            return head.data;
        }
    }

    public static void main(String[] args) {

        Stacks sll = new Stacks();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}

// In this, head is the top most element of the stack.
