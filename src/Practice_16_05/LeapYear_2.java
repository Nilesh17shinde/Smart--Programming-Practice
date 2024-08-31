package Practice_16_05;

import java.util.Scanner;

public class LeapYear_2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any year: ");
        int year=sc.nextInt();
        if((year%400==0)||(year%100!=0 && year%4==0)){
            System.out.println("Leap Year");
        }else {
            System.out.println("Not Leap Year");
        }
    }
}
