package FUNCTION;

public class chech_num_is_even_or_not {
    public static boolean isEven(int n){
        boolean result = false;
        if(n%2==0){
            result=true;
        }
        return result;
    }

    public static void main(String[] args) {
        int num=10;
        System.out.println(isEven(3));
    }
}
