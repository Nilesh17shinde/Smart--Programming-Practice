package Practice.Practice_IMP;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year: ");
        int Year= sc.nextInt();
        if((Year%400==0)||(Year%100 !=0)&&(Year%4==0)){
            System.out.println(Year +": Leap Year.");
        }else {
            System.out.println(Year +" :Not Leap Year");
        }
    }
}