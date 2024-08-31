package Patterns.Practice;
/*
 *****
  *****
   *****
    *****
     *****

* */
/*
     *****
    *****
   *****
  *****
 *****
* */
public class Cross_Rectangle {
    public static void main(String[] args) {
        int n=5;
            for (int i=n;i>=1;i--){
            //for (int i=1;i<=n;i++){
                for (int j=i;j>=2;j--){
                    System.out.print(" ");
                }
                for (int j=1;j<=n;j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
    }
}
