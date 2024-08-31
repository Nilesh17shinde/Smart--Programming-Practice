package All_Patterns;
/*
 *
 * *
 * 2 *
 * 2 3 *
 * * * * *

 * */
public class Pattern82 {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                if (i==1||i==n||i==j||j==1){
                    System.out.print("* ");
                }else {
                    System.out.print(j+" ");
                }

            }
            System.out.println();
        }
    }
}
