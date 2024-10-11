package BASIC;

public class practicePatterns {
    public static void main(String[] args) {
        char a='A';
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print(a);
                a++;
            }
            System.out.println();

        }
    }
}
