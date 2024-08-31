package Java8Features;
interface AA{
    static void sayHello(){
        System.out.println("Hello !!!");
    }
}
public class StaticMethodDemo implements AA{
    public static void main(String[] args) {
        AA.sayHello();
    }
}
