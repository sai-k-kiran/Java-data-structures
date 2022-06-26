// Java program to demonstrate a Queue

import java.util.LinkedList;
import java.util.Queue;

class Q2 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // Queue<String> pq = new PriorityQueue<>();

        for (int i = 0; i < 5; i++)
            q.add(i);

        System.out.println("Queue: " + q);

        System.out.println("removed element: " + q.remove()); // removes top element

        System.out.println("removed element: " + q.poll()); // returns and removes top element

        System.out.println("head of queue: "+ q.peek());

        System.out.println("Size of queue: " + q.size()); // Size of the queue
    }
}
