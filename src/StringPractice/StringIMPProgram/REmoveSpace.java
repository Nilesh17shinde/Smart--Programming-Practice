package StringPractice.StringIMPProgram;

public class REmoveSpace {
    public static void main(String[] args) {
        String str=" ja va Sta r ";
        System.out.println(str);
        String string=str.trim();
        System.out.println(string.replaceAll(" ",""));
    }
}
