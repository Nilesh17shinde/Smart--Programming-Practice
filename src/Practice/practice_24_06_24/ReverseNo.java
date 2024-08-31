package Practice.practice_24_06_24;

public class ReverseNo {
    public static void main(String[] args) {
        String number="1254.01";
        String reverse="";
        for(int i=number.length()-1;i>=0;i--){
            reverse=reverse+number.charAt(i);
        }
        System.out.println(reverse);
    }
}
