package Prctice11_01_24;

public class PalindromeString {
    public static void main(String[] args) {
        String str="nitin";

        String rev="";
        int l=str.length();
        for (int i=l-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
        if (str.equals(rev)){
            System.out.println("Given String is Palindrom");
        }else {
            System.out.println("Given String is not palindrome");
        }
    }
}
