package BASIC;
import java.util.Scanner;
public class calculate_bill {
    public static void main(String[] args) {
        System.out.println("enter the price of pencil");
        Scanner sc=new Scanner(System.in);
        float $=sc.nextInt();
        System.out.println("enter the price of pen");
        float num2=sc.nextInt();
        System.out.println("enter the price of eraser");
        float num3=sc.nextInt();
        float total=$+num2+num3;
        System.out.println("total bill");
        System.out.println(total+(0.18f*total));

    }
}
