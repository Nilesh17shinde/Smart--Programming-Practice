package Practice.Other;

import java.util.Scanner;

public class Count_Word_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str= sc.nextLine();

        System.out.println("No of words: "+str.split(" ").length);
    }
}
