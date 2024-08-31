package StringPractice.StringIMPProgram;
// Reverse String
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String str="Hello";
//        Approch1
        String rev="";
        for (int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);

//        Approch 2
        System.out.println("----------------------------------------------");
        char[] string =str.toCharArray();
        for (int i= string.length-1;i>=0;i--){
            System.out.print(string[i]);
        }
        System.out.println();
//        Approch 3
        System.out.println("----------------------------------------------");
        for (int i= str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
//        Approch 4
        System.out.println("------------------------------------------------");
        StringBuffer buffer=new StringBuffer(str);
        System.out.println(buffer.reverse());

//        Approch 5
        System.out.println();
        System.out.println("--------------------------------------------------");
        StringBuilder builder=new StringBuilder(str);
        System.out.println(builder.reverse());
    }
}
