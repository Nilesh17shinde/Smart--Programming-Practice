package Practice.Other;

import java.util.Scanner;

public class Delete_Vowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String str= sc.nextLine();
        String output;

        output=str.replaceAll("[AEIOUaeiou]"," ");
        System.out.println("After change: "+output);
    }
}
