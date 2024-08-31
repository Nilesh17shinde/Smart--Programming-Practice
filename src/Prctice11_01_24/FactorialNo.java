package Prctice11_01_24;

public class FactorialNo {
    public static void main(String[] args) {
        int n=5;
        int fact=1;
        for (int i=1;i<=n;i++){
            fact=fact*i;
            System.out.print(fact+" ");
        }
        System.out.println();
        System.out.println("Factorial No of "+n+" = "+fact);
    }
}
