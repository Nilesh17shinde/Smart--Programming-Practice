package Patterns;

import java.util.Scanner;

public class Leap_p {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year U want to check: ");
        int year=sc.nextInt();

        if((year%400==0)||(year%100!=0 && year%4==0)){
            System.out.println("Leap Year");
        }else {
            System.out.println("Not Leap Year");
        }
    }
}
