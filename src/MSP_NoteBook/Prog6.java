package MSP_NoteBook;

import java.util.Scanner;
//Reverse String

public class Prog6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String U want to Reverse: ");
        String str=sc.nextLine();
        int length=str.length();
        System.out.println("Original String is: "+str);
        String rev=" ";
        for (int i=length-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println("After Reverse String is "+rev);
    }
    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine();
        char ch;
        String rev="";
        for (int i=str.length()-1;i>=0;i--){
            ch=str.charAt(i);
            rev=rev+ch;
        }
        System.out.println("After Reverse String Is "+rev);
    }*/
}
