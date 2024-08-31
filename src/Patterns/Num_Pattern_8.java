package Patterns;

public class Num_Pattern_8 {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            int no=i;
            for (int j=1;j<=i;j++){
                System.out.print(no+" ");
                no=no+5-j;
            }
            System.out.println();
        }
    }
}
