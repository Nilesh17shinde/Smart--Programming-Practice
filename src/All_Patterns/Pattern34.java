package All_Patterns;
/*
     *
    ***
   *****
  *******
 *********

* */
public class Pattern34 {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=n;j>=i;j--){
                System.out.print(" ");
            }
            for (int j=1;j<i*2;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
