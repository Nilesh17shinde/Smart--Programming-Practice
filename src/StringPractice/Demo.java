package StringPractice;

public class Demo {
    public static void main(String[] args) {
        String s="Nilesh";
        String s2="Shinde";
        String s3="NILESH";
        System.out.println(s.concat(s2));

        System.out.println(s.compareTo(s2));
        System.out.println(s.compareTo(s3));
        System.out.println(s.compareToIgnoreCase(s3));
        System.out.println(s.equals(s3));
        System.out.println(s.equalsIgnoreCase(s3));
        System.out.println(s==s3);
        System.out.println(String.join("_",s,s2));

        System.out.println("----------------------------------------------------------------------");
        String s4="My Name is Nilesh";

        System.out.println(s4.substring(5));
        System.out.println(s4.substring(5,10));
        System.out.println(s4.subSequence(3,9));
    }
}
