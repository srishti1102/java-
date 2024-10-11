package BASIC;
import java.util.Scanner;
public class example_if_else_conditions {
    public static void main(String[] args) {
        System.out.println("enter your body temperature");
        Scanner sc=new Scanner(System.in);
        float temp = sc.nextFloat();
        if(temp>100){
            System.out.println("you have a fever");
        }else{
            System.out.println("you don't have fever");
        }
    }
}
