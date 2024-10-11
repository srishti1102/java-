package BASIC;

public class isSumpalindrome {
    public static void main(String[] args) {
        int n=56;
        int sum =0;
        int res=0;
        int mainsum=0;
        while(n!=0){
            int rem=n%10;
            sum=sum+res;
            mainsum=sum;
            n=n/10;
        }
         System.out.println(sum);
        while(sum!=0){
            int rem=sum%10;
            res=res*10+rem;
            sum=sum/10;
        }
        System.out.println(res);
    }
}
