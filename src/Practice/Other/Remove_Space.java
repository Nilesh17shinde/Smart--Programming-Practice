package Practice.Other;

import java.util.Scanner;

public class Remove_Space {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine();
        String output;

        output=str.replaceAll("[ ]",".");
        System.out.println("After Change: "+output);
    }
}
