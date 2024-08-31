package Practice.IMP;

public class RevNo1 {
    public static void main(String[] args) {
        int no=987654321;
        int rev=0,rem;
        for (;no!=0;no=no/10){
            rem=no%10;
            rev=rev*10+rem;
            //no=no/10;
        }
        System.out.println(rev);
    }
}
