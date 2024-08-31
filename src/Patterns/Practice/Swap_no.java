package Patterns.Practice;

public class Swap_no {
    public static void main(String[] args) {
        int a=10;
        int b=90;
        /*int temp=0;
        temp=a;
        a=b;
        b=temp;*/
        a=a+b;//100
        b=a-b;//100-90=10
        a=a-b;//100-10=90
        System.out.println(a+" "+b);
    }

}
