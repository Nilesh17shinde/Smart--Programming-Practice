package Practice.IMP;

import java.util.Scanner;

public class PrimeNo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any No U want to check: ");
        int n= sc.nextInt();
        int temp=0;
        for (int i=2;i<=n-1;i++){
            if (n%i==0){
                temp++;
            }
        }
        if (temp==0){
            System.out.println(n+" No is Prime");
        }else {
            System.out.println(n+" is NOT Prime");
        }
    }
}
