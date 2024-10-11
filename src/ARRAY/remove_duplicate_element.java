package ARRAY;

public class remove_duplicate_element {
    public static void main(String[] args) {
        int arr[] ={0,0,1,1,1,2,2,3,3,4};
        int res[]=new int [arr.length];
        int count=0;
        int element=0;
        for(int i=0;i<arr.length;i++){
            element=arr[i];
            if(arr[i]==arr[i+1]){
                    for(int j=0;j<arr.length;j++){
                        res[j]=element;
                    }
            }
        }
        for(int i=0;i<res.length;i++){
            if(res[i]>=0){
                count++;
            }
            System.out.println(count);
        }
    }
}
