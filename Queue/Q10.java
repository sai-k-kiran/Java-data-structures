// Java Program to check if a queue of first n natural number can be sorted using a stack

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

class Q10 {
    static Queue<Integer> q = new LinkedList<Integer>();
    
    static boolean checkSorted(int n){
        Stack<Integer> s = new Stack<>();

        int expexted = 1;
        int front;

        while(q.size() != 0){
            front = q.peek();
            q.poll();

            if(front == expexted){
                expexted++;
            }else{
                if(s.size() == 0){
                    s.push(front);
                }else if(s.size() != 0 && s.peek() < front){
                    return false;
                }else{
                    s.push(front);
                }
            }

            while(s.size() != 0 && s.peek() == expexted){
                s.pop();
                expexted++;
            }
        }

        if (expexted - 1 == n && s.size() == 0)
            return true;

        return false;
    }

    public static void main(String args[]){
        q.add(5);
        q.add(1);
        q.add(6);
        q.add(2);
        q.add(3);
        q.add(4);
     
        int n = q.size();
 
        if (checkSorted(n))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
