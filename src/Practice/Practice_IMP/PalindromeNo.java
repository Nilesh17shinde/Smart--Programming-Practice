package Practice.Practice_IMP;

public class PalindromeNo {
    public static void main(String[] args) {
        int n=121;
        int rev=0;
        int rem;
        int temp=n;
        while (n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println(rev);
        if (temp==rev){
            System.out.println("Palindrome No");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
