package Practice.Other;

import java.util.Scanner;

public class Check_Two_Equals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First String: ");
        String str=sc.nextLine();
        System.out.println("Enter Second String: ");
        String str2=sc.nextLine();

        if (str.equals(str2)){
            System.out.println("Equals");
        }else {
            System.out.println("Not");
        }
    }
}
