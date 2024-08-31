package Practice_16_05;

import java.util.Scanner;

public class Fibonachi_Rec {
    void fiboSe(int no,int a,int b){
        int c;
        System.out.println("Fibonachii No: ");
        for (int i=0;i<no;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any no: ");
        int n=sc.nextInt();
        Fibonachi_Rec obj=new Fibonachi_Rec();
        obj.fiboSe(n,0,1);
    }
}
