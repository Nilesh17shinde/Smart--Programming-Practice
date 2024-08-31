package Patterns.Practice;

public class Num_Pattern11 {
    public static void main(String[] args) {
        int n=4;
        int x=1;
        for (int i=0;i<=n;i++){
            for (int j=0;j<=i;j++){
                System.out.print( x-i+" ");
                x++;
            }
            System.out.println();
        }
    }
}
