package Practice.Other;

import java.util.Scanner;

public class Alphabet_Count {
    public static void main(String[] args) {
        String str;
        int length;
        int counter[]=new int[300];

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        str=sc.nextLine();

        length=str.length();
        for (int i=0;i<length;i++){
            counter[(int)str.charAt(i)]++;

        }
        for (int i=0;i<counter.length;i++){
            if (counter[i]!=0){
                System.out.println((char)i+" - "+counter[i]);
            }
        }
    }
}
