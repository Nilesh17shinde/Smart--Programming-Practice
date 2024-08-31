package Practice.Practice_03_07_24;

public class DemoVariables {
    int a=10;
    static int b=20;
    public static void main(String[] args) {
        DemoVariables obj=new DemoVariables();
        System.out.println(obj.a);
        System.out.println(obj.b);
        b=50;
        obj.a=100;
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println("**************************************");
        DemoVariables obj1=new DemoVariables();
        System.out.println(obj1.a);

        System.out.println(b);
    }
}
