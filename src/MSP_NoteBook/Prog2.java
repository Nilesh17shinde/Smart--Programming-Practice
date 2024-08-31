package MSP_NoteBook;

import java.util.Scanner;

//Swap No
public class Prog2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of Num1: ");
        int a=sc.nextInt();

        System.out.print("Enter value of Num2: ");
        int b=sc.nextInt();

        System.out.println("-------------Original Values is--------------");
        System.out.println("Num1: "+a);
        System.out.println("Num2: "+b);

       /* a=a+b;
        b=a-b;
        a=a-b;*/
        int temp=a;
        a=b;
        b=temp;

        System.out.println("-------------After Swap Values is--------------");
        System.out.println("Num1: "+a);
        System.out.println("Num2: "+b);


    }
}
