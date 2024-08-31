package Practice.IMP;

import java.util.Scanner;

public class Vowels_Count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str= sc.nextLine();
        int count=0;
        char array[]=str.toCharArray();
        for (char ch : array){
            switch (ch){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':

                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':

                    count++;
            }
        }
        System.out.println(count+ " vowels found in "+str);
    }
}
