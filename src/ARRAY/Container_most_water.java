package ARRAY;

public class Container_most_water {
    public static int maxWater(int arr[]){
        int maxAra=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int minHeight = Math.min(arr[i],arr[j]);
                int width =j-i;
                int result=minHeight*width;
                if(maxAra<result){
                    maxAra=result;
                }
            }
        }
        return maxAra;
    }
    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
        System.out.println(maxWater(arr));

    }
}
