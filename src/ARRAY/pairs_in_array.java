package ARRAY;

public class pairs_in_array {
    public static void pairs_of_array(int arr[]) {
        for(int i=0;i<arr.length;i++){
            int start=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.println("(" +start +","+arr[j] +")");
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12};
        pairs_of_array(arr);
    }
}
