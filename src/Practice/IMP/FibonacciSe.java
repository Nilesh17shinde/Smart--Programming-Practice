package Practice.IMP;

import java.util.Scanner;

public class FibonacciSe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n= sc.nextInt();
        int a=0,b=1;
        int temp;
        System.out.print(a+" "+b+" ");
        for (int i=1;i<=n;i++){
            temp=a+b;
            System.out.print(temp+" ");
            a=b;
            b=temp;
        }
    }
}
