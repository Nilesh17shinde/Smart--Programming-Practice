package Prctice11_01_24;

public class ReverseString {
    public static void main(String[] args) {
        String str="abcdefgh";
        String res="";
        char ch;
        int l=str.length();
        for (int i=l-1;i>=0;i--){
            ch=str.charAt(i);
            res=res+ch;
        }
        System.out.println(res);
    }
}
