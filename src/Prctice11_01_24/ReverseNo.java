package Prctice11_01_24;

public class ReverseNo {
    public static void main(String[] args) {
        int n=12345;
        int rev=0,rem;
        System.out.println("Original No: "+n);
        while (n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println("After Change: " +rev);
    }
}
