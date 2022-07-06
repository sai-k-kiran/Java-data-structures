// Implement stack using single queue

import java.util.*;

class Stack19 {
    class Stack{
        static Queue<Integer> q = new LinkedList<Integer>();

        static void push(int x){
            int s = q.size();

            q.add(x);

            for(int i = 0; i < s; i++){
                q.add(q.poll());
            }
        }

        static void pop(){
            if(q.isEmpty()){
                return;
            }else{
                q.poll();
            }
        }

        static int top(){
            return (q.isEmpty() ? -1 : q.peek());
        }
    }

    public static void main(String[] args){

        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
  
        System.out.println(Stack.top());
        Stack.pop();
        System.out.println(Stack.top());
        Stack.pop();
        System.out.println(Stack.top());
    }
}
