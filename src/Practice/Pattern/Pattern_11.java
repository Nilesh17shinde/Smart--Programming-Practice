package Practice.Pattern;
/*
---------------------------
  *       *
   *     *
    *   *
     * *
      *
----------------------------
 */
public class Pattern_11 {
    public static void main(String[] args) {
        int n=5;
        for (int i=n;i>=1;i--){
            for (int j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<(i*2);k++){
                if(k>1 && k<(i*2)-1){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
