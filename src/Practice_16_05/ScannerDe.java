package Practice_16_05;

import java.util.Scanner;

public class ScannerDe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name=sc.nextLine();
        System.out.println("Enter Mob No: ");
        long mob=sc.nextLong();
        System.out.println("Enter Gender");
        char gender=sc.next().charAt(0);
        System.out.println("-----------------------------------------");
        System.out.println(name);
        System.out.println(mob);
        System.out.println(gender);
    }
}
