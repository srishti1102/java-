package BASIC;
import java.util.Scanner;
public class average_of_given_number {
    public static void main(String[] args) {
        System.out.println("enter total number");
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("enter the number");
        Scanner number =new Scanner(System.in);
        int a=number.nextInt();
        int b=number.nextInt();
        int c=number.nextInt();
        System.out.println("average of given number");
        System.out.println((a+b+c)/num);

    }
}
