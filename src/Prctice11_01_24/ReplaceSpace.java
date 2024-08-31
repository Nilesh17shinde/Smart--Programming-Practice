package Prctice11_01_24;

import java.util.Scanner;

public class ReplaceSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Value: ");
        String name=sc.nextLine();
        char ch='_';
        name=name.replace(' ',ch);
        System.out.println("After Replace String is "+name);

    }
}
