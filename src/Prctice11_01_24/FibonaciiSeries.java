package Prctice11_01_24;

public class FibonaciiSeries {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int fibo=0;
        int n=10;
        for (int i=1;i<=n;i++){
            fibo=a+b;
            a=b;
            b=fibo;
            System.out.print(fibo+" ");
        }
        /*while (fibo<=n){
            a=b;
            b=fibo;
            fibo=a+b;
            System.out.print(fibo+" ");

        }*/
    }
}
