package RECURSION;

public class printName {
    public static void printName(String name,int n){
        if(n==0){
            return;
        }
        printName(name,n-1);
        System.out.println(name);
    }
    public static void main(String[] args) {
        String name="srishti";
        int n=5;
        printName(name,5);
    }
}
