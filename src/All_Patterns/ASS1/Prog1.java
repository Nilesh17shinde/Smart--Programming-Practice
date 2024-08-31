package All_Patterns.ASS1;

public class Prog1 {
    public static void main(String[] args) {
        int n=5;
        for (int i=n;i>=1;i--){
            for (int j=1;j<=n;j++){
                if (i==j){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
