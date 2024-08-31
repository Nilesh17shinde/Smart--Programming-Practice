package Patterns;
/*
5
5 4
5 4 3
5 4 3 2
5 4 3 2 1
 */
public class Num_Pattern_7 {
    public static void main(String[] args) {
        int n=5;
        for (int i=n;i>=1;i--){
            for (int j=n;j>=i;j--){
               System.out.print(j+" ");
                //System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
