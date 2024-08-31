package MSP_NoteBook;

import java.util.Scanner;

//Palindrome No
public class Prog10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any no u want to check: ");
        int n=sc.nextInt();
        int temp=n;
        int rev=0;

        while (n>0){
            rev=rev*10+(n%10);
            n=n/10;
        }
        System.out.println(rev);
        if (rev==temp){
            System.out.println("No is Palindrome ");
        }else {
            System.out.println("No is Not Palindrome");
        }
    }
}
