package Java8Features;
interface A{
    default void sayHello(){
        System.out.println("I am in A Method");
    }
}
interface B{
    default void sayHello(){
        System.out.println("I am in B Method");
    }
}
public class DefaultMethodDemo implements A,B {
    public static void main(String[] args) {
    DefaultMethodDemo demo=new DefaultMethodDemo();
    demo.sayHello();
        }
        public void sayHello(){
        B.super.sayHello();
        }
    }
