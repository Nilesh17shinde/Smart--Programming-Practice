package Patterns.Practice;

public class Cross_Rectangle_Bound {
    public static void main(String[] args) {
        int n=5;
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=n;j++){
                if (i==1||i==n||j==1||j==n){
                    System.out.print(j+" ");
                }else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
}