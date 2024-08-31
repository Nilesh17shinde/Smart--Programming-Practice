package All_Patterns.Ass3;
/*
     1
    21
   321
  4321
 54321
* */
public class Prog2 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int k = n; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
