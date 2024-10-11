package ARRAY;

public class reverce_array {
    public static void reverce_array(int arr[]){
        int start=0;
        int end=arr.length-1;
        int temp=0;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12};
        reverce_array(arr);
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
