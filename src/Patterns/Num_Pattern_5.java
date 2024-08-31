package Patterns;
/*
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
 */
public class Num_Pattern_5 {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            for (int k=1;k<=i;k++){
                System.out.print(k+" ");
            }
            for (int j=i-1;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
