package All_Patterns;
/*
 *
 **
 * *
 ****
 * * *
 ******
 * * * *
 ********
 * * * * *
 **********
 * * * * * *
 ************

* */
public class Pattern83 {
    public static void main(String[] args) {
        int n=6;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        for (int j=1;j<=i*2;j++) {
            System.out.print("*");
        }
            System.out.println();
        }
    }
}
