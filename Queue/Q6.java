// Implement Queue using Linked list.
class Queue{
    static Node rear = null, front = null;

    public static int dequeue(){
        if(front == null){
            System.out.println("Queue Underflow");
            System.exit(-1);
        }

        Node temp = front;
        System.out.printf("Removing %d: ", temp.data);

        front = front.next;

        if(front == null){
            rear = null;
        }
        return temp.data;
    }

    public static void enqueue(int x){
        Node new_node = new Node(x);

        if (front == null){
            front = new_node;
            rear = new_node;
        }
        else {
            rear.next = new_node;
            rear = new_node;
        }
    }

    public static int top(){
        if(front == null){
            System.exit(-1);
        }
        return front.data;
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);

        System.out.println("Top element: "+ q.top());

        System.out.println("Removed element: "+ q.dequeue());
    }
}

class Node{
    int data;
    Node next;

    public Node(int d){
        data = d;
        next = null;
    }
}