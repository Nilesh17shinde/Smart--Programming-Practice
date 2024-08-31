package Prctice11_01_24;

public class Pattern3mix {
    public static void main(String[] args) {
        int n=5;

        for (int i=1;i<n;i++){
            for (int k=i;k<n;k++){
                System.out.print(k+5+" ");
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
    }
}
