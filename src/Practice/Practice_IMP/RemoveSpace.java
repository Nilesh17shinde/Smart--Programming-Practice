package Practice.Practice_IMP;

import java.util.Scanner;

public class RemoveSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String string=sc.nextLine();
        char ch='.';
        System.out.println("Original String is \n"+string);
        string=string.replace(' ',ch);

        System.out.println("After change String is \n"+string);
    }
}
