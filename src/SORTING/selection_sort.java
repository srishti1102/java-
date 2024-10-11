package SORTING;

public class selection_sort {
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        for(int i=0;i<arr.length-1;i++){
            int min_pos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min_pos]>arr[j]){
                    min_pos=j;
                }
                int temp=arr[min_pos];
                arr[min_pos]=arr[i];
                arr[i]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
