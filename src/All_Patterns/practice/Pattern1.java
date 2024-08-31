package All_Patterns.practice;

public class Pattern1 {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int j=i;j<=n;j++){
                System.out.print("*"+" ");
            }
            for (int k=n;k>=i;k--){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            for (int j=n;j>=i;j--){
                System.out.print(" ");
            }
            for (int j=1;j<i*2;j++){
                System.out.print("*");
            }
            for (int k=5;k>=i;k--){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
