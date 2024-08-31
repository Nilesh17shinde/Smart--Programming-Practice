package Prctice11_01_24;

public class SwapNo {
    public static void main(String[] args) {
        int n=10;
        int m=20;
        System.out.println("n= "+n);
        System.out.println("m= "+m);
        n=n+m; //n=10+20=30
        m=n-m; //m=30-20=10
        n=n-m; //n=30-10=20
        System.out.println("n= "+n);
        System.out.println("m= "+m);
    }
}
