package Practice.IMP;

public class RevString {
    public static void main(String[] args) {
        String name="Nilesh Shinde";
        String var="";
        int length=name.length();
        System.out.println(length);
        System.out.println("Original String is "+name);
        for (int i=length-1;i>=0;i--){
            var=var+name.charAt(i);
        }
        System.out.println("After Reverse String is "+var);
    }
}
