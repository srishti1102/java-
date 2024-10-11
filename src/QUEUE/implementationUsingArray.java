package QUEUE;

import javax.management.QueryExp;
import java.util.Queue;

public class implementationUsingArray {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front=-1;
        }

        // is empty method
        public static boolean isEmpty() {
            return rear == -1;
        }
        //is full method
        public static boolean isFull(){
            return (rear+1)%size==front;
        }

        //add method
        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("queue is full");
                return;
            }
            rear=rear+1;
            arr[rear]=data;
        }
        //remove method
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty Queue");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear=rear-1;
            return front;
        }
     //peek method
        public static int peek(){
            if(isEmpty()){
                return  -1;
            }
            return arr[0];
        }

    }

    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
