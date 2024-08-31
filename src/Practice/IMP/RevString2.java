package Practice.IMP;

import java.util.Scanner;

public class RevString2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String ");
        String name= sc.nextLine();
        String str="";
        char ch;
        for (int i=name.length()-1;i>=0;i--){
            ch=name.charAt(i);
            str=str+ch;
        }
        System.out.println(str);
    }
}
