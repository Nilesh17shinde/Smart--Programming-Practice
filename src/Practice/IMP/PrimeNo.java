package Practice.IMP;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any No: ");
        int no= sc.nextInt();
        int temp=0;
        for (int i=2;i<no;i++){
            if (no%i==0){
                temp=temp+1;
            }
        }
        if (temp == 0){
            System.out.println(no+" is Prime");
        }else {
            System.out.println(no+" is Not Prime");
        }
    }
}
