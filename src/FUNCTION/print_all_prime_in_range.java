package FUNCTION;

public class print_all_prime_in_range {
    public static boolean isPrime(int n){
        boolean isPrime=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                isPrime=false;
            }
        }
        return isPrime;
    }
    public static void primeInRange(int n){
        for(int i=2;i<n;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int num=100;
        primeInRange(num);

    }
}
