package FeaturesOfJava8.Lambda;

public class Add  {
    public static void main(String[] args) {
        /*AddInterface i=(a,b)->{
            return a+b;
        };*/
        AddInterface i = (a, b) -> a + b;
        System.out.println(i.sum(10, 20));
        System.out.println(i.sum(88, 12));
        System.out.println("----------------------------------------------------------------");

//        LengthOfString lengthString = (str -> str.length());
        LengthOfString lengthString = str -> str.length();
        System.out.println(lengthString.print("Nilesh"));
    }
}
