package All_Patterns.Ass2;

public class Prog3 {
    public static void main(String[] args) {
        int n=6;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i==1 || i==n || j==1 || j==n ){
                    System.out.print("* ");
                }else {
                    System.out.print(j+i+" ");
                }
            }
            System.out.println();
        }
    }
}
