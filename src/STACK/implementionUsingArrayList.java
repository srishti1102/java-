package STACK;

import java.util.*;

public class implementionUsingArrayList {
     static class Stack{
        static ArrayList<Integer>list=new ArrayList<>();
        //is empty method
        public static boolean isEmpty() {
            return list.size()==0;
        }
        // pop method
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
       //push method;
        public static void push(int data){
            list.add(data);
        }
        //peek method
        public static int peek(){
            return list.get(list.size()-1);
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
