package All_Patterns.Ass3;

public class Prog3 {
    public static void main(String[] args) {
        String str="RSL Solution";
        String str1="";

        for (int i=str.length()-1;i>=0;i--){
            str1=str1+str.charAt(i);
        }
        System.out.println("After Reverse: "+str1);
    }
}
