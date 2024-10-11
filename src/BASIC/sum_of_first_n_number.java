package BASIC;
import java.util.Scanner;
public class sum_of_first_n_number {
    public static void main(String[] args) {
        System.out.println("enter any number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=num){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
}
