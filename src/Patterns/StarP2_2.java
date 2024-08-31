package Patterns;
/*WAP to print following pattern
     *
    * *
   * * *
  * * * *
 * * * * *
 */
public class StarP2_2 {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            for (int k=n;k>=1;k--){
                if (k>i){
                    System.out.print(" ");
                }else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}
