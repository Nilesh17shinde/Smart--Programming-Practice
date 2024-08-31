package Practice_16_05;

import java.util.Scanner;

public class FactNo1 {
    int calFact(int no){
        if (no>=1){
            return no*(calFact(no-1));
        }return 1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any no: ");
        int no= sc.nextInt();
        FactNo1 obj=new FactNo1();
        System.out.println(obj.calFact(no));
    }
}
