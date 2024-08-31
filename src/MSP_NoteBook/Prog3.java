package MSP_NoteBook;

import java.util.Scanner;

//Multiplication of table
public class Prog3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Value u want to print table: ");
        int no=sc.nextInt();
        int mult=1;
        for (int i=1;i<=10;i++){
            mult=no*i;
            System.out.println(i+" X "+no+" = "+mult);

        }
    }
}
