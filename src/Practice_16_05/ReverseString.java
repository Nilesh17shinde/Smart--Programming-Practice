package Practice_16_05;

public class ReverseString {
    public static void main(String[] args) {
        String name="String";
        int len=name.length();
        String rev=" ";
        for (int i=len-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
        System.out.print(rev);
    }
}
