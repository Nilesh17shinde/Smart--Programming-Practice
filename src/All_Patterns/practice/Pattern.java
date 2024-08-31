package All_Patterns.practice;

public class Pattern {
    public static void main(String[] args) {
        int n = 5;

        /*for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print(j);

            }
            for (int j = i; j >=2 ; j--) {
                System.out.print(j-1);

            }
            System.out.println();
        }*/

        /*for (int i = 1; i <=n ; i++) {
            for (int j = n; j >=i ; j-- ) {
                System.out.print(j);
            }
            System.out.println();
        }*/

        for (int i = 1; i <=n-1 ; i++) {
            int no=i;
            for (int j = 1; j <=i ; j++) {
                System.out.print(no+" ");
                no=no+4-j;
            }
            System.out.println();
        }
    }
}
