package Patterns;

public class StarP3_1 {
    public static void main(String[] args) {
        int n=5;
       //for (int i=n;i>=1;i--) {
         for (int i=1;i<=n;i++){
            for (int j = 1; j <= i; j++) {
                if (i >= 2 && j <= i - 1) {
                    System.out.print(" ");

                } else {
                    System.out.print(j);
                }
            }
                System.out.println();

        }
    }
}
