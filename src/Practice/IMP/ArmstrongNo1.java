package Practice.IMP;

import java.util.Scanner;

public class ArmstrongNo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any No U want to check: ");
        int n= sc.nextInt();
        int temp1=n;
        int length=0;
        while (temp1 !=0){
            length=length+1;
            temp1=temp1/10;
        }
        int temp2=n;
        int arm=0;
        int rem;

        while (temp2 !=0){
            rem=temp2%10;
            int mult=1;
            for (int i=1;i<=length;i++){
                mult=mult*rem;
            }
            arm=arm+mult;
            temp2=temp2/10;
        }
        if (n==arm){
            System.out.println("Arm");
        }else {
            System.out.println("Not");
        }
    }
}
