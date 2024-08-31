package All_Patterns;
/*
 *
  *
   *
    *
     *
 * */
public class Pattern59 {
    public static void main(String[] args) {
        int n=5;
       /* for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
              if(i>=2 && j<=i-1){
                  System.out.print(" ");
              }
              else {
                  System.out.print("*");
              }
            }
            System.out.println();
        }*/
        System.out.println("----------------------------------------------");
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i==j){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
