package FUNCTION;

public class average_of_three_num {
    public static int Avg(int a,int b,int c){
        int sum=a+b+c;
        int result=sum/3;
        return result;
    }

    public static void main(String[] args) {
        int num1=6;
        int num2=7;
        int num3=2;
        System.out.println(Avg(num1,num2,num3));
    }
}
