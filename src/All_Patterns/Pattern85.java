package All_Patterns;
/*
  1
 *2*
**3**
* */
public class Pattern85 {
    public static void main(String[] args) {
        int n=3;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i+2;j++){
                if (j<=(n-i)){
                    System.out.print(" ");
                }else if (j==n){
                    System.out.print(i);
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}