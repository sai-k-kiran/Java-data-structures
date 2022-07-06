/* Java Program to implement a stack using two queue */

import java.util.*;

class Stack18 {
    static class Stack{
        static Queue<Integer> q1 = new LinkedList<Integer>();
        static Queue<Integer> q2 = new LinkedList<Integer>();

        static int curr_size;

        Stack(){
            curr_size = 0;
        }

        static void push(int x){
            curr_size++;

            q2.add(x);

            while(!q1.isEmpty()){
                q2.add(q1.poll());
            }

            Queue<Integer> q = q1;
            q1 = q2;
            q2 = q;
        }

        static void pop(){
            if(q1.isEmpty()){
                return;
            }
            q1.remove();
            curr_size--;
        }

        static int top(){
            if (q1.isEmpty())
                return -1;
            return q1.peek();
        }
  
        static int size(){
            return curr_size;
        }
    }   
    
    public static void main(String[] args){

        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
  
        System.out.println("current size: " + Stack.size());
        System.out.println(Stack.top());
        Stack.pop();
        System.out.println(Stack.top());
        Stack.pop();
        System.out.println(Stack.top());
  
        System.out.println("current size: " + Stack.size());
    }
}


// As push(), pop() and all other methods in our created "Stack" class are static, we do not need to create
// an object to access those static methods. Simply use the class name to use those static methods.

// Although, you can create an object of the "Stack" class and use those methods with the object
// i.e Stack s = new Stack();
//     s.push(3);
// This also works but the IDE will give warnings.