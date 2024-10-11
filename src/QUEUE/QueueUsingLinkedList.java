package QUEUE;

public class QueueUsingLinkedList {
    static class Node{
        static int data;
        static Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static class Queue{
        static Node head=null;
        static Node tail=null;

        // is empty method
        public static boolean isEmpty(){
            return head==null & tail==null;
        }

        // add method

        public static void add(int data){

            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;

            }
            tail.next=newNode;
            tail=newNode;

        }

        // remove  method
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int front=head.data;
            if(tail==head){
                tail=head=null;
            }else{
                head=head.next;
            }
            return front;
        }
        //peek method;
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }




    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
