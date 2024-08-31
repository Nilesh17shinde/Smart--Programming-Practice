package Practice.IMP;

import java.util.Scanner;

public class PalindromeNo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No: ");
        int no=sc.nextInt();
        int temp=no;
        int rem,rev=0;
        while (no >0){
            rem=no%10;
            rev=rev*10+rem;
            no=no/10;
        }

        if (rev==temp){
            System.out.println("No is Palindrome");
        }else {
            System.out.println("No Not Palindrome");
        }
    }
}
