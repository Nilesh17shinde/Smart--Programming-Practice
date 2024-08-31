package StringPractice;

public class ReplaceDemo {
    public static void main(String[] args) {
        String s="I love india";
        System.out.println(s.replace(" ","_"));

        System.out.println(s.replaceFirst(" ","_"));

        System.out.println(s.replaceAll(" ","'"));
    }
}
