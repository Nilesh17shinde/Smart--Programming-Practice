package Practice.Pattern;
/*
     *
    ***
   *****
  *******
 *********
 */
public class Pattern_Pyaramid_7 {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            for (int k=n-1;k>=i;k--){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            for (int t=2;t<=i;t++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
