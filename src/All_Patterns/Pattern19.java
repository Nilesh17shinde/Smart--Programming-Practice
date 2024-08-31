package All_Patterns;
/*
     *
    * *
   * * *
  * * * *
 * * * * *

 * */
public class Pattern19 {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            for (int y=n-1;y>=i;y--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
