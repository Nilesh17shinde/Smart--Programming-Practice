package All_Patterns;
/*
     5
    54
   543
  5432
 54321
 54321
  5432
   543
    54
     5

* */
public class Pattern47 {
    public static void main(String[] args) {
        int n=5;
        for (int i=n;i>=1;i--){
            for (int k=i;k>=1;k--){
                System.out.print(" ");
            }
            for (int j=n;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i=1;i<=n;i++){
            for (int k=i;k>=1;k--){
                System.out.print(" ");
            }
            for (int j=n;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
