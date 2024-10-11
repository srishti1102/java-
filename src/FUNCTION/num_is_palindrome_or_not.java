package FUNCTION;

public class num_is_palindrome_or_not {
    public static boolean isPalindrome(int num){
        boolean result=false;
        int reverce=0;
        while(num!=0){
            int reminder=num%10;
            reverce=reverce*10+reminder;
            num=num/10;
        }
        if(num==reverce){
            result=true;
        }
        return result;
    }

    public static void main(String[] args) {
        int num=121;
        System.out.println(isPalindrome(num));
    }
}
