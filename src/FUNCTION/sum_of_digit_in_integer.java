package FUNCTION;

public class sum_of_digit_in_integer {
    public static int sum(int num){
        int sum=0;
        while(num!=0){
            int lastDigit=num%10;
            sum=sum+lastDigit;
            num=num/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num=131;
        System.out.println(sum(num));
    }
}
