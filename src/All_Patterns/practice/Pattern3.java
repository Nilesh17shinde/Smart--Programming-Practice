package All_Patterns.practice;

public class Pattern3 {
    public static void main(String[] args) {
        int n=5;
        /*for (int i=5;i>=1;i--){
            for (int j=1;j<=n;j++){
                if (j==i) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

       /* for (int i=n;i>=1;i--){
            for (int j=n;j>=i;j--){
                System.out.print(" ");
            }
            for (int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }*/
        for (int i=n;i>=1;i--){
            for (int j=i;j>=1;j--){
                System.out.print(" ");
            }
            for (int j=n;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}