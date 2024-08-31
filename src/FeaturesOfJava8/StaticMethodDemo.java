package FeaturesOfJava8;
interface A{
    static void abc(){
        System.out.println("Static Method");
    }
}
public class StaticMethodDemo implements A {
    public static void main(String[] args) {
        //StaticMethodDemo staticMethodDemo=new StaticMethodDemo();
        A.abc();
    }

}
