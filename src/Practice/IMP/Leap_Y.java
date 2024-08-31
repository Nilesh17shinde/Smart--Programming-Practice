package Practice.IMP;

import java.util.Scanner;

public class Leap_Y {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year U want to check Leap Year Of Not ");
        int year= sc.nextInt();
        if ((year%400==0)|| (year %100 !=0 && year %4==0)){
            System.out.println(year+" is Leap Year");
        }else {
            System.out.println(year+" is not leap year");
        }
    }
}
