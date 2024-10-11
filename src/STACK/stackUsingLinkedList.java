package STACK;

import java.util.Stack;

public class stackUsingLinkedList {
    static class node{
        int data;
        node next;
        node(int data){
            this .data=data;
            this.next=null;
        }
    }
    // stack implementation
    static class stack{
        static node head =null;

        // isEmpty method
        public static boolean isEmpty(){
            return head==null;
        }
        //push method

        public static void push(int data){
            node newNode =new node( data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        //pop method

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }

        //peek method
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }

}
