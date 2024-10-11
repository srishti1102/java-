package HEAPS;

import java.util.ArrayList;

public class addElement {
    static class Heap{
        ArrayList<Integer> arr=new ArrayList<>();
        // add method *****************************************8
        public void add(int data){
            arr.add(data);
            int x=arr.size()-1;
            int parent=(x-1)/2;
            while(arr.get(x)<arr.get(parent)){
                int temp=arr.get(x);
                arr.set(x,arr.get(parent));
                arr.set(parent,temp);
                x=parent;
                parent=(x-1)/2;
            }

        }
        private void heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int mid=i;
            if(left<arr.size() && arr.get(mid)>arr.get(left) ){
                mid=left;
            }
            if(right<arr.size() && arr.get(mid)>arr.get(right)){
                mid=right;
            }
            if(mid!=i){
                int temp=arr.get(i);
                arr.set(i,arr.get(mid));
                arr.set(mid,temp);
                heapify(mid);
            }
        }
        // remove method ****************************************
        public int remove(){
            int data= arr.get(0);
            int temp=arr.get(0);
            int lastval=arr.size()-1;
            arr.set(0,arr.get(lastval));
            arr.set(arr.size()-1,temp);
            arr.remove(arr.size()-1);
            heapify(0);
            return data;
        }
        // is empty method ***************************************
        public boolean isEmpty(){
            if(arr.size()==0){
                return true;
            }
            return false;
        }
        //peeek method *******************************************
        public int peek(){
            return arr.get(0);
        }
        public static void main(String[] args) {
            Heap hq=new Heap();
            hq.add(1);
            hq.add(3);
            hq.add(5);
            hq.add(2);
            while(!hq.isEmpty()){
                System.out.println(hq.peek());
                hq.remove();
            }
        }
    }
}
