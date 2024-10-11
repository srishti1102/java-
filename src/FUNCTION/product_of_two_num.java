package FUNCTION;

public class product_of_two_num {
    public static int product(int a,int b){
        int mul=a*b;
        return mul;
    }

    public static void main(String[] args) {
        int a=3;
        int b=5;
        int result=product(a,b);
        System.out.println(result);
    }
}
