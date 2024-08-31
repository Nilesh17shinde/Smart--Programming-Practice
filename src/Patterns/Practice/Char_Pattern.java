package Patterns.Practice;
/*
A
B C
D E F
G H I J
 */
public class Char_Pattern {
    /*public static void main(String[] args) {
        int n=4;
        char ch='A';
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }*/
    public static void main(String[] args) {
        int n=4;
        int num=1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
