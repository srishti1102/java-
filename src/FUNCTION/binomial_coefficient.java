package FUNCTION;

public class binomial_coefficient {
    public static int binomial_cofficient(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result = result * i;
        }
        return result;
    }
    public static int finalresult(int n,int r){
        int fact_n=binomial_cofficient(n);
        int fact_r=binomial_cofficient(r);
        int fact_nmr=binomial_cofficient(n-r);
        int result=fact_n/(fact_r * fact_nmr);
        return result;
    }

    public static void main(String[] args) {
        int n=5;
        int r=2;
        int result=finalresult(n,r);
        System.out.println(result);
    }
}
