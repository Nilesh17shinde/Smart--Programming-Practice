package Patterns.Practice;
/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */
public class Num_Pattern8 {
    public static void main(String[] args) {
        int n=4;
        int a=6;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
