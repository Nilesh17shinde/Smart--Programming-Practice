package Practice_16_05;
//WAP to find Larger of three no..
import java.util.Scanner;

public class FLarg_No {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("a= ");
        int a=sc.nextInt();
        System.out.println("b= ");
        int b=sc.nextInt();
        System.out.println("c= ");
        int c=sc.nextInt();

        if(a>b && a>c){
            System.out.println("a is larg");
        } else if (b>a && b>c) {
            System.out.println("b is large");
        }else {
            System.out.println("C is Larg");
        }
    }
}
