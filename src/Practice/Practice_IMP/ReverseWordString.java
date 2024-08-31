package Practice.Practice_IMP;

import java.util.Scanner;

public class ReverseWordString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine();

        String[] name;
        name=str.split(" ");

        for (int i=name.length-1;i>=0;i--){
            System.out.print(name[i]+" ");
        }
    }
}
