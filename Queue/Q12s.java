// Program to reverse a queue with recusrion

import java.util.LinkedList;
import java.util.Queue;

public class Q12s {

    static Queue<Integer> q;

    static void Print(){
        while(!q.isEmpty()){
            System.out.print(q.poll()+ " ");
        }
    }

    static void reverseQueue(){
        if(q.size() == 0){
            return;
        }

        int front = q.poll();
        reverseQueue();
        q.add(front);
    }
    public static void main(String[] args) {
        q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        reverseQueue();
        
        Print();
    }
}
