package Practice_16_05;

public class PalindromeNo1 {
    public static void main(String[] args) {
        int n=12521;
        int temp=n;
        int rem,rev=0;
        while (temp!=0)
        {
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if (n==rev){
            System.out.println("Num Palindrome");
        }else {
            System.out.println("Num Not Palindrome");
        }
    }
}
