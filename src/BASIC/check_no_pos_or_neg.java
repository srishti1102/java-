package BASIC;
import java.util.Scanner;
public class check_no_pos_or_neg {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>0){
            System.out.println("number is positive");
        }else{
            System.out.println("number is negative");
        }
    }
}
