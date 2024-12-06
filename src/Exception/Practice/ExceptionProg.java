package Exception.Practice;

public class ExceptionProg {
    public static void main(String[] args) {
        String str="Devaff";
        try {
            String result=getString(str);
            System.out.println(result);
        }catch (Exception e){
            System.out.println("String Value is Null !!");
        }
        System.out.println(">>>>>>>>>>>>>>>>Last Line........");

    }

    private static String getString(String str) {
        return str.toUpperCase();
    }
}
