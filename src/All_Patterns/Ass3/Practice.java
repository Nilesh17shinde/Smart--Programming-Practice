package All_Patterns.Ass3;

public class Practice {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j = i; j <n ; j++) {
                System.out.print(j+5+" ");
            }
            for (int j=1;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------------");

        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <=n ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >=1 ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
