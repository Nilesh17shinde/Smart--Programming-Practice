package Practice.Pattern;
/*
      *
     **
    ***
   ****
  *****
 ******
  *****
   ****
    ***
     **
      *

 */
public class Pattern_5 {
    public static void main(String[] args) {
        int n=6;
        for (int i=1;i<=n;i++){
            for (int k=n-1;k>=i;k--){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int m=n-1;m>=1;m--){
            for (int k=n-1;k>=m;k--){
                System.out.print(" ");
            }
            for (int x=1;x<=m;x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
