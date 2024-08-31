package Practice.Pattern;
/*
 *
  *
   *
    *
     *

 */
public class Pattern_Digonal_9 {
    public static void main(String[] args) {
        int n=5;
        for (int i=n;i>=1;i--){
            for (int k=n-1;k>=i;k--){
                System.out.print(" ");
            }
            for (int j=1;j<=1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
