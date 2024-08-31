package Practice.IMP;

import java.util.Scanner;

public class LeapYear1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Year U want to check Leap or NOT : ");
        int year= sc.nextInt();
        if ((year%400==0)||(year%4==0 && year%100 !=0)){
            System.out.println(year+" is Leap Year");
        }else {
            System.out.println(year+" Not Leap Year");
        }
    }
}
