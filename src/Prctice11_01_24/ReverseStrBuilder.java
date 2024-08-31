package Prctice11_01_24;

import java.util.Scanner;

public class ReverseStrBuilder {
    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder stringBuilder=new StringBuilder(str);
        System.out.println(stringBuilder.reverse());
    }*/
    public static void main(String[] args) {
        String name="String";
        StringBuffer stringBuffer=new StringBuffer(name);
        System.out.println(stringBuffer.reverse());
    }

}
