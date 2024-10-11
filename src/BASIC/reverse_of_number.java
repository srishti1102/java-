package BASIC;

public class reverse_of_number {
    public static void main(String[] args) {
        int num=1534236469;
        int reverce=0;
        while(num!=0){
            int reme = num%10;
            reverce=reverce*10+reme;
            System.out.println(reverce);
            num=num/10;
        }
        System.out.println(reverce);
    }
}
