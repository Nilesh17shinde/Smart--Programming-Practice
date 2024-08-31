package Prctice11_01_24;

public class LeapYear {
    public static void main(String[] args) {
        int year=2025;
        if ((year%400==0)||(year%100 !=0 && year%4==0)){
            System.out.println(year+" is leap year!!");
        }else {
            System.out.println(year+" is not leap year.");
        }
    }
}
