package PATTERNS;

public class Number_pattern {
    public static void main(String[] args) {
        int n =3;
        for(int i=n; i>0; i--){
            for(int j=i;j>0;j--){
                System.out.print("3");
            }
            for(int k=i;k>0;k--){
                System.out.print("2");
            }
            for(int k=i;k>0;k--){
                System.out.print("1");
            }
            System.out.println();
        }
    }
}
