// Java program to reverse a Queue
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Q12 {
    static Queue<Integer> q;

    static void reverseQueue(){
        Stack<Integer> s = new Stack<>();

        while(!q.isEmpty()){
            int item = q.poll();
            s.push(item);
        }
        while(!s.isEmpty()){
            int item = s.pop();
            q.add(item);
        }
    }

    static void Print(){
        while(!q.isEmpty()){
            System.out.print(q.poll()+ " ");
        }
    }
    
    public static void main(String args[]){
        q = new LinkedList<Integer>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);
 
        reverseQueue();
        Print();
    }
}
