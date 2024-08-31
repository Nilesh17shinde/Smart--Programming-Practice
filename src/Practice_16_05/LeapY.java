package Practice_16_05;

public class LeapY {
    public static void main(String[] args) {
        int y=2016;
        if ((y%400==0)||(y%4==0 && y%100 !=0)){
            System.out.println("Leap Year");
        }else {
            System.out.println("Not leap year");
        }
    }
}
