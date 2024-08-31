package Practice.IMP;

public class RevNo {
    public static void main(String[] args) {
        int n=54321;
        int rev=0;
        int rem;
        while (n !=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println(rev);
    }
}
