package Practice.Other;

import java.util.Scanner;

public class Concanate_String {
    public static void main(String[] args) {
        String str1,str2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First String: ");
        str1= sc.nextLine();
        System.out.println("Enter Second String: ");
        str2= sc.nextLine();

        System.out.println("After Merge: "+str1.concat(str2));
    }
}
