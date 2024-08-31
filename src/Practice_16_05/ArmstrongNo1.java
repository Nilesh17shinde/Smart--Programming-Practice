package Practice_16_05;

import java.util.Scanner;

public class ArmstrongNo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any No: ");
        int n=sc.nextInt();
        int temp=n;
        int length=0;
        while (temp!=0){
            temp=temp/10;
            length++;
        }

        int temp1=n;
        int rem;
        int res=0;
        while (temp1!=0) {
            rem = temp1 % 10;
            int mult = 1;
            for (int i = 1; i <= length; i++) {
                mult = mult * rem;
            }
            res = res + mult;
            temp1 = temp1 / 10;
        }
            if (n==res){
                System.out.println("Armstrong no");
            }
            else {
                System.out.println("Not Armstrong");
            }

    }
}
