package All_Patterns.practice;

public class Pattern2 {
    public static void main(String[] args) {
        int n=5;
        /*for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j%2+" ");
            }
            System.out.println();
        }*/
        int num=1;
        /*for (int i=n-1;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }*/
        /*for (int i=1;i<=n+1;i++){
            for (int j=1;j<=i;j++){
                System.out.print(num%2+" ");
                num++;
            }
            System.out.println();
        }*/

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i==j || i+j==n+1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
