// Java program to demonstrate the working of Priority Queue

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(9);
        pq.add(6);
        pq.add(27);
        pq.add(8);

        System.out.println(pq); // Prints all elements

        System.out.println("Top element: "+ pq.peek());

        // System.out.println("Top element and remove -> " +pq.poll());
        // // Prints top element and removes it. Like stack.pop()

        pq.remove(27); // removes 27 from queue. If no element is mentioned, then removes the top elem

        // System.out.println("After removal: "+pq);

        Iterator iterator = pq.iterator();
  
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " "); // Prints all elements
        }

    }
}
