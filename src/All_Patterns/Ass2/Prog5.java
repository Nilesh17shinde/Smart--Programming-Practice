package All_Patterns.Ass2;

public class Prog5 {
    public static void main(String[] args) {
        int n = 5;
        int num = 27;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(num+" ");
                num--;
            }
            System.out.println();
        }
    }
}
/*
27
26 25
24 23 22
21 20 19 18
17 16 15 14 13*/
