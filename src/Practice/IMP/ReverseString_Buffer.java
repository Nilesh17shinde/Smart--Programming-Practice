package Practice.IMP;

import java.util.Scanner;

public class ReverseString_Buffer {
    public static void revString(String str){
       /* StringBuilder sb=new StringBuilder(str);
        System.out.println(sb.reverse());

        */
        StringBuffer sb1=new StringBuffer(str);
        System.out.println(sb1.reverse());

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String name= sc.nextLine();
        revString(name);
    }
}
