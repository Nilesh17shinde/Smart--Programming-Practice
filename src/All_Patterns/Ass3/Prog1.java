package All_Patterns.Ass3;
/*
6 7 8 9 1 2 3 4 5
7 8 9 1 2 3 4 5
8 9 1 2 3 4 5
9 1 2 3 4 5
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
* */
public class Prog1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i < n; i++) {
            for (int k = i; k < n; k++) {
                System.out.print(k + 5 + " ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();


        }
    }
}
