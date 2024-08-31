package Patterns;
/*WAP to following pattern
     *
    *
   *
  *
 *

 */
public class StarP3 {
    public static void main(String[] args) {
        int n=5;
        //for (int i=1;i<=n;i++){
            for (int i=n;i>=1;i--){
            for (int j=n;j>=i;j--){
                if (j>i){
                    System.out.print(" ");
                }else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
