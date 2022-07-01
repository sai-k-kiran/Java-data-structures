// Java code to implement Priority Queue  using Linked List 

public class Q9 {
    static class Node{
        int data;
        Node next;
        int priority;
    }

    static Node node = new Node();

    static Node new_node(int d, int p){
        Node temp = new Node();
        temp.data = d;
        temp.priority = p;
        temp.next = null;

        return temp;
    }

    static int peek(Node head){
        return head.data;
    }

    static Node pop(Node head){
        Node temp = head;
        head = head.next;   // may be temp.next
        return head;
    }

    static Node push(Node head, int d, int p){
        Node start = head;

        Node temp = new_node(d, p);

        if(head.priority > p){
            temp.next = head;
            head = temp;
        }else{
            while(start.next != null && start.next.priority < p){
                start = start.next;
            }
            temp.next = start.next; // that means temp.next = null
            start.next = temp;
        }
        return head;
    }

    static int isEmpty(Node head) { 
        return ((head) == null) ? 1 : 0; 
    }

    public static void main(String[] args) {
        Node pq = new_node(4, 1); 

        pq = push(pq, 2, 2);
        pq = push(pq, 5, 3);
        pq = push(pq, 6, 9);
        pq = push(pq, 7, 6);
        pq = push(pq, 9, 8);

        while (isEmpty(pq)==0) { 
            System.out.printf("%d ", peek(pq)); 
            pq = pop(pq); 
        } 
    }
}
