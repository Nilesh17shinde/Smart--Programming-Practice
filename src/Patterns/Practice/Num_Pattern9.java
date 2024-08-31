package Patterns.Practice;
/*
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5
* */
public class Num_Pattern9 {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=n;j>=i+1;j--){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i=n;i>=1;i--){
            for (int j=n;j>=i+1;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=3;k++){
                for (int m=1;m<=3;m++){
                    System.out.print("#  ");
                }
            }
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
