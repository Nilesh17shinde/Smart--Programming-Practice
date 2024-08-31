package MSP_NoteBook;

import java.util.Scanner;
//Fibbonachi No
public class Prog7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value u want to find fibonacci series: ");
        int n=sc.nextInt();
        int a=0;int b=1;int c=0;int temp=0;
        for (int i=1;i<=n;i++){
            temp=a+b;
            System.out.print(temp+" ");
            a=b;
            b=temp;
        }
        /*while (temp<=n){

            System.out.print(temp+" ");
            a=b;
            b=temp;
            temp=a+b;
        }*/
    }
}
