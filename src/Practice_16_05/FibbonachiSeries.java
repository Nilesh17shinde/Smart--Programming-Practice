package Practice_16_05;

public class FibbonachiSeries {
    public static void main(String[] args) {
        int a=0,b=1,c;
        for (int i=1;i<=10;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}