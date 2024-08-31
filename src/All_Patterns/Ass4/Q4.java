package All_Patterns.Ass4;

public class Q4 {
    public static void main(String[] args) {
        int n=5;
        for (int i=n;i>=1;i--){
            for (int k=n-1;k>=i;k--) {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
