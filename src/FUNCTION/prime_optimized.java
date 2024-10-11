package FUNCTION;

public class prime_optimized {
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int nu =4;
        boolean result=isPrime(nu);
        System.out.println(result);
    }
}
