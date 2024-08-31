package Prctice11_01_24;

public class PalindromeNo {
    public static void main(String[] args) {
        int no=101 ;
        int temp=no;
        int rem,rev=0;
        while (no>0){
            rem=no%10;
            rev=rev*10+rem;
            no=no/10;
        }
        System.out.println(rev);
        if (temp==rev){
            System.out.println("Palindrome No");
        }else {
            System.out.println("Not Palindrome No");
        }
    }
}
