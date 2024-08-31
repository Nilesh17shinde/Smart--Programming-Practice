package Practice.Practice_IMP;

public class ReverseString {
    public static void main(String[] args) {
        String str="String";
        String str1="";
        int length=str.length();
        for (int i=length-1;i>=0;i--){
            str1=str1+str.charAt(i);
        }
        System.out.println(str1);
    }
}
