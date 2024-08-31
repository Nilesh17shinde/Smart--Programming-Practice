package All_Patterns;
/*
 * * * * *
 * 2 3 4 *
 * 2 3 4 *
 * 2 3 4 *
 * * * * *

 * */
public class Pattern79 {
    public static void main(String[] args) {
        int n=6;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i==1||i==n||j==1||j==n){
                    System.out.print("* ");
                }else {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
