// Implement Queue using stacks.

import java.util.*;

class Q5 {
   static class Queue{
    static Stack<Integer> input = new Stack<>();
    static Stack<Integer> output = new Stack<>();  

    static void pushS(int x){
        input.push(x);
    }

    static int popS(){
        if(!output.isEmpty()){
            return output.pop();
        }
        else{
            while(!input.isEmpty()){
                int a = input.pop();
                output.push(a);
            }
        }
        return output.pop();
    }

    static int topS(){
        if(!output.isEmpty()){
            return output.peek();
        }else{
            while(!input.isEmpty()){
                int a = input.pop();
                output.push(a);
            }
        }
        return output.peek();
    }
   }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.pushS(3);
        q.pushS(4);
        q.pushS(5);
        q.pushS(6);

        System.out.println("top element: "+ q.topS());

        System.out.println("Popped element: "+ q.popS());

        System.out.println("top element after popping: "+ q.topS());
    }
}

