package Practice.IMP;

import java.util.Scanner;

public class FactorialNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No: ");
        int n= sc.nextInt();
        int fact=1;
        for (int k=1;k<=n;k++){
            fact=fact*k;
        }
        System.out.println("Factorial of "+n+" is "+fact);
    }
}
