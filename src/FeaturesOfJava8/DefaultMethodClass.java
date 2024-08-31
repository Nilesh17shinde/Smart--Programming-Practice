package FeaturesOfJava8;
interface Parent{
default void sayHello(){
    System.out.println("Hello Parent");
}
}
/*class Child implements Parent{
    @Override
    public void sayHello() {
        Parent.super.sayHello();
        System.out.println("Hi Child");
    }
}*/
interface Child{
    default void sayHello(/*int a*/){
        System.out.println("Hello Child");
    }
}
public class DefaultMethodClass implements Parent, Child {
    public static void main(String[] args) {
    DefaultMethodClass obj=new DefaultMethodClass();
    obj.sayHello();
    }

    @Override
    public void sayHello() {
        Child.super.sayHello();
        Parent.super.sayHello();
    }
}
