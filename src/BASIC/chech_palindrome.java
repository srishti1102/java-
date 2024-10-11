package BASIC;

public class chech_palindrome {
    public static void main(String[] args){
        boolean e=true;
        int num=-131;
        int copynum=num;
        int reverce=0;
        while(num!=0){
            int remender =num%10;
            reverce=reverce*10+remender;
            num=num/10;
        }
        System.out.println(reverce);
        if(copynum<0){
            e=false;
        }
        if(copynum!=reverce){
            e=false;
        }
        System.out.println(e);
    }
}

