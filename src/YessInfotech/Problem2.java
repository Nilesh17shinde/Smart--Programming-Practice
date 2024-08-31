package YessInfotech;

import java.util.Scanner;

/*
Largest Palindrome
* input: banana output: anana
* input xyz  output x or y or z
* print(compressString(string)
* */
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your String: ");
        String name=sc.nextLine();
        String temp=name;
        String str="";
        for (int i=name.length()-1;i>=0;i--){
            str=str+name.charAt(i); //Reverse the String
        }
        if (str==name){
            System.out.println("Palindrome..");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
