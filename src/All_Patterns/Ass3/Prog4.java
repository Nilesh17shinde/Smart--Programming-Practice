package All_Patterns.Ass3;

public class Prog4 {
    public static void main(String[] args) {
        int n=10;
        int a=0;
        int b=1;
        int temp=0;
        for (int i=1;i<=n;i++){
            temp=a+b;
            System.out.print(temp+" ");
            a=b;
            b=temp;
        }
    }
}
