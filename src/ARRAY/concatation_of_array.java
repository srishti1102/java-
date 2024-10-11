package ARRAY;

public class concatation_of_array {
    public static void main(String[] args) {
        int num[]={1,2,1};
        int result[]=new int[2*num.length];
        for(int i=0;i<num.length;i++){
            result[i]=num[i];
            result[num.length+i]=num[i];
        }
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
