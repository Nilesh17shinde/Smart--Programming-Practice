package All_Patterns;
/*
 * * * * *
 * 4 5 6 *
 * 5 6 7 *
 * 6 7 8 *
 * * * * *
 * */
public class Pattern80 {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i==1||i==n||j==1||j==n){
                    System.out.print("* ");
                }else {
                    System.out.print(j+i+" ");
                }
            }
            System.out.println();
        }
    }
}
