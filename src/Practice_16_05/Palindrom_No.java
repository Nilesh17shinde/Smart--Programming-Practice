package Practice_16_05;

public class Palindrom_No {
    public static void main(String[] args) {
        int no=1221;
        int temp=no;
        int rem,rev=0;
        while(temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if (no==rev){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
