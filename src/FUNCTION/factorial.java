package FUNCTION;

public class factorial {
    public static int fact(int n){
        int mul=1;
        for(int i=1;i<=n; i++){
            mul=mul*i;
        }
        return mul;
    }

    public static void main(String[] args) {
        int num=5;
        int result=fact(num);
        System.out.println(result);
    }
}
