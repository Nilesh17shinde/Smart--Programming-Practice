package Practice.IMP;

import java.util.Scanner;

public class PrimeAllNo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N No: ");
        int No= sc.nextInt();
        int temp=0;
        for (int i=1;i<=No;i++){
            for (int k=2;k<=i-1;k++){
                if (i%k==0){
                    temp++;
                }
            }
            if (temp==0){
                System.out.print(i+" ");
            }else {
                temp=0;
            }
        }
    }
}
