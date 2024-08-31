package Practice_16_05;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any year: ");
        int year=sc.nextInt();

        if (year %4==0){
            if (year %100==0){
                if (year%400==0){
                    System.out.println("Leap year");
                }else {
                    System.out.println("Not leap year");
                }
            }else {
                System.out.println("Leap Year");
            }


        }else {
            System.out.println("Not Leap Year");
        }
    }
}
