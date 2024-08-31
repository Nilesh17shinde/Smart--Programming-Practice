package Practice.Other;

import java.util.Scanner;

public class Delete_Word_Sen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine();
        System.out.println("Enter word u want delete: ");
        String output= sc.nextLine();

        str=str.replaceAll(output,"");
        System.out.println("After Delete: "+str);

    }
}
