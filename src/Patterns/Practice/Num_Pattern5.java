package Patterns.Practice;
/*
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
 */
public class Num_Pattern5 {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            for (int k=n-1;k>=i;k--){
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for (int t=i;t>=2;t--){
                System.out.print(t-1+" ");
            }
            System.out.println();
        }
    }
}
