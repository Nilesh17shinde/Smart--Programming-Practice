package Patterns;
/*
     1
    2 2
   3 3 3
  4 4 4 4
 5 5 5 5 5
 */

/*
     1
    2 1
   3 2 1
  4 3 2 1
 5 4 3 2 1
 */
public class Num_Pattern_4 {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            for (int o=n;o>=i;o--){
                System.out.print(" ");
            }
            for (int k=i;k>=1;k--){
                 System.out.print(k+" ");
                //System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}