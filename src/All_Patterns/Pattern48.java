package All_Patterns;
/*
     5
    54
   543
  5432
 54321
  5432
   543
    54
     5
* */
public class Pattern48 {
    public static void main(String[] args) {
        int n=5;
        for (int i=n;i>=1;i--){
            for (int j=i;j>=1;j--){
                System.out.print(" ");
            }
            for (int j=n;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i=2;i<=n;i++){
            for (int j=i;j>=1;j--){
                System.out.print(" ");
            }
            for (int k=n;k>=i;k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
