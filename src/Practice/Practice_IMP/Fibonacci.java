package Practice.Practice_IMP;

public class Fibonacci {
    public static void main(String[] args) {
        int n=8;
        int a=0,b=1,temp=0;

        for (int i=1;i<=n;i++){
            temp=a+b;//0+1=1,1+1=2, 1+2=3 ,2+3=5, 3+5=8 5+8=13, 8+13=21, 13+21=34
            System.out.println(temp);//1 2 3 5 8 13 21 34
            a=b;//1 1 2 3 5 8 13 21
            b=temp;//1 2 3 5 8 13 21 34
        }
    }
}
