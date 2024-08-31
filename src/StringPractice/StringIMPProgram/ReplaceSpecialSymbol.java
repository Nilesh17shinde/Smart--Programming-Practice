package StringPractice.StringIMPProgram;

public class ReplaceSpecialSymbol {
    public static void main(String[] args) {
        String str="Ja@*va!Lan#$&*gu&ag#e~";

        String plainString=str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(plainString);
    }
}
