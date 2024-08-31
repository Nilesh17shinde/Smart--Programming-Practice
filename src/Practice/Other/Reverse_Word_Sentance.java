package Practice.Other;

import java.util.Scanner;

public class Reverse_Word_Sentance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine();
        String[] output;
        output=str.split(" ");
        System.out.println("After Reverse Sentence is: ");
        for (int i=output.length-1;i>=0;i--){
            System.out.print(output[i]+" ");
        }
    }
}
