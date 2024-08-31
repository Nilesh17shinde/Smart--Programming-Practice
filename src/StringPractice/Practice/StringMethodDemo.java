package StringPractice.Practice;

public class StringMethodDemo {
    public static void main(String[] args) {
        String str="My_Name is_Nilesh Shinde";
        String[] testVal=str.split("_");

        for (int i=0;i< testVal.length;i++){
            System.out.print(testVal[i]);
        }
        System.out.println("------------------------------------------------");
        String x="Hello";
        String y="world";

        int a=100;
        int b=200;

        System.out.println(x+y);
        System.out.println(a+b);
        System.out.println(x+y+a+b);
        System.out.println(a+b+x+y);
        System.out.println(x+y+(a+b));
    }
}
