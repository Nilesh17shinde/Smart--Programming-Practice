package Practice.IMP;

import java.util.Scanner;

public class Remove_Space_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Sentance");
        String str= sc.nextLine();
        char ch='_';
        System.out.println("Original String is \n"+str);
        str=str.replace(' ',ch);
        System.out.println("After Change: \n"+str);
    }
}
