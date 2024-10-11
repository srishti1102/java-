package FUNCTION;

public class primeNumber_or_not {
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                return isPrime;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        int num=5;
        boolean result=isPrime(num);
        System.out.println(result);
}}
