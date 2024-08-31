package OOPS_Concept.Polymorphism_P;

public class OverLoding {
    void show(int n ,int b){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
    void show(int n){
        int rem,rev=0;
        while (n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.print(rev);
    }
    public static void main(String[] args) {
    OverLoding obj=new OverLoding();
    obj.show(54321);
        System.out.println();
    obj.show(5,5);
    }
}
