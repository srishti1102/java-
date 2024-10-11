package ARRAY;

public class largest_in_array {
    public static void main(String[] args) {
        int num[]={1,2,6,3,5};
        int largest=0;
        largest =num[0];
        for(int i=1;i<num.length;i++){
            if(largest<=num[i]){
                largest=num[i];
            }
        }
        System.out.println(largest);
    }
}
