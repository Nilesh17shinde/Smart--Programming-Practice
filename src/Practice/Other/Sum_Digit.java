package Practice.Other;

public class Sum_Digit {
    public static void main(String[] args) {
        int a=54678;
        Sum_Digit obj=new Sum_Digit();
        obj.sumDig(a);
    }
    public void sumDig(int n){
        int rem,rev=0;
        int sum=0;
        while (n>0){
            rem=n%10;
           // rev=rev*10+rem;
            n=n/10;
            sum=sum+rem;
        }
        System.out.println(sum);
    }
}
