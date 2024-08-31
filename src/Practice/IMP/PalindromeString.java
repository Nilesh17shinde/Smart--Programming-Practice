package Practice.IMP;

public class PalindromeString {
    public static void main(String[] args) {
        String name="nitin";
        String temp=name;
        String rev="";

        int length=name.length();
        for (int i=length-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
        System.out.println(rev);
        if (name.equals(rev)){
            System.out.println("Palindrome String");
        }else {
            System.out.println("Not");
        }
    }
}
