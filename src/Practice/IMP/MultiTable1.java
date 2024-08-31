package Practice.IMP;

import java.util.Scanner;

public class MultiTable1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No u want to find Table: ");
        int no= sc.nextInt();
        int mult=1;
        for (int i=1;i<=10;i++){
            mult=i*no;
            System.out.println(no+" x "+i+" = "+mult);
        }
    }
}
