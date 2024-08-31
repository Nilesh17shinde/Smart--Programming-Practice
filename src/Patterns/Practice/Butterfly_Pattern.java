package Patterns.Practice;
/*
 *        *
 **      **
 ***    ***
 ****  ****
 **********
 **********
 ****  ****
 ***    ***
 **      **
 *        *

 */
public class Butterfly_Pattern {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            for (int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for (int b=1;b<=i;b++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=n;i>=1;i--){
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            for (int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for (int b=1;b<=i;b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}