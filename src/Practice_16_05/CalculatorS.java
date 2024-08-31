package Practice_16_05;

import java.util.Scanner;

public class CalculatorS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value: ");
        int a =sc.nextInt();
        System.out.println("Action");
        String Sym =sc.next();
        System.out.println("Enter value: ");
        int b = sc.nextInt();
        int res;
        switch (Sym) {
            case "+":
                res = a + b;
                System.out.println(res);
                break;
            case "-":res=a-b;
                System.out.println(res);
                break;
            case "/":res=a/b;
                System.out.println(res);
                break;
            case "*":res=a*b;
                System.out.println(res);
                break;
            case "%": res=a%b;
                System.out.println(res);
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
