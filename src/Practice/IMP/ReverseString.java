package Practice.IMP;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine();
        String revstr="";
        for (int i=(str.length())-1;i>=0;i--){
            revstr=revstr+str.charAt(i);
        }
        System.out.println("After Reverse String is "+revstr);
    }
}
