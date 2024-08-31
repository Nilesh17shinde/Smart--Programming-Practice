package Prctice11_01_24;

import java.util.Scanner;

public class VowelsCounter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String name=sc.nextLine();
        int count=0;
        char array[]=name.toCharArray();
        for (char ch:array)
        {
            switch (ch){
                case 'a':
                case 'e':
                case 'o':
                case 'i':
                case 'u':
                case 'A':
                case 'E':
                case 'O':
                case 'I':
                case 'U':
                    count++;
            }
        }
        System.out.println(count);
    }
}
