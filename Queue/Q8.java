// Java program for insertion and deletion in Circular Queue

import java.util.*;

public class Q8 {
    static class Node{
        int data;
        Node next;
    }

    static class Queue{
        Node front, rear;
    }

    static void enqueue(Queue q, int d){
        Node temp = new Node();
        temp.data = d;

        if(q.front == null){
            q.front = temp;
        }else{
            q.rear.next = temp;
        }
        q.rear = temp;
        q.rear.next = q.front;
    }

    static int dequeue(Queue q){
        if(q.front == null){
            System.out.printf("Queue is empty");
            return Integer.MIN_VALUE;
        }

        int value;
        if(q.front == q.rear){ // that means if there is only one node
            value = q.front.data;
            q.front = null;
            q.rear = null;
        }else{
            Node temp = q.front;
            value = temp.data;
            q.front= q.front.next;
            q.rear.next = q.front;
        }
        return value;
    }

    static void display(Queue q){
        Node temp = q.front;
        while(temp.next != q.front){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.print(temp.data + "\n");
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.front = q.rear = null;

        enqueue(q, 3);
        enqueue(q, 4);
        enqueue(q, 5);
        enqueue(q, 6);

        display(q);

        System.out.println("Deleted value: "+ dequeue(q));

        display(q);
    }
}
