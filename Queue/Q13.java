// Reverse the first K elements from the Queue.

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Q13 {
    static Queue<Integer> q;

    static void Print(){
        while(!q.isEmpty()){
            System.out.print(q.poll()+ " ");
        }
    }

    static void reverseQueue(int k){
        Stack<Integer> s = new Stack<>();
        int count = 1;

        while(!q.isEmpty()){
            while(count <= k){
                int item = q.poll();
                s.push(item);
                count++;
            }
            q.remove();
        }
        while(!s.isEmpty()){
            int item = s.pop();
            q.add(item);
        }
    }
    public static void main(String[] args) {
        q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        reverseQueue(4);
        
        Print();
    }    
}
