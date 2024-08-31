package Practice_16_05;

import java.util.Scanner;

public class MultiplicationT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any No: ");
        int no=sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(no+"*"+i+"="+no*i);
        }
    }
}
