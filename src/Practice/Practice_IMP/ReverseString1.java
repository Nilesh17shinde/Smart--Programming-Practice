package Practice.Practice_IMP;

public class ReverseString1 {
    public static void main(String[] args) {
        String name="reverse";
        String str="";
        int length=name.length();
        char ch;

        for (int i=length-1;i>=0;i--){
            ch=name.charAt(i);
            str=str+ch;
        }
        System.out.println(str);
    }
}
