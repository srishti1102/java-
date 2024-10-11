package FUNCTION;

public class binary_to_decimal {
    public static void binaryToDecimal(int n){
        int power =0;
        int decNum=0;
        while(n>0){
            int lastDigit=n%10;
            decNum=decNum+(lastDigit *(int) Math.pow(2,power));
            power++;
            n=n/10;
        }
        System.out.println(decNum);
    }

    public static void main(String[] args) {
        int num =1111111;
        binaryToDecimal(num);
    }
}
