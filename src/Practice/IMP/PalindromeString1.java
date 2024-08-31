package Practice.IMP;

import java.util.Scanner;

public class PalindromeString1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String U want To Check: ");
        String name=sc.nextLine();
        String temp="";

        for (int i=(name.length())-1;i>=0;i--){
            temp=temp+name.charAt(i);
        }
        if (name.equals(temp)){
            System.out.println("String is Palindrome");
        }else {
            System.out.println("String Not Palindrome");
        }
    }
}
