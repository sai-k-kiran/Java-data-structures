// Interleave the first half of the queue with second half

// Input : 11 12 13 14 15 16 17 18 19 20
// Output : 11 16 12 17 13 18 14 19 15 20

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q14{
    static void Interleave(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        int halfSize = q.size()/2;

        for (int i = 0; i < halfSize; i++){
            s.push(q.poll());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        for (int i = 0; i < halfSize; i++){
            q.add(q.poll());
        }
        for (int i = 0; i < halfSize; i++){
            s.push(q.poll());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
            q.add(q.poll());
        }
    }

    public static void main(String[] args)
    {
        Queue<Integer> q = new java.util.LinkedList<>();
        q.add(11);
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);
        q.add(16);
        q.add(17);
        q.add(18);
        q.add(19);
        q.add(20);

        Interleave(q);
        int length = q.size();
        
        for (int i = 0; i < length; i++) {
            System.out.print(q.peek() + " ");
            q.poll();
        }
    }
}
