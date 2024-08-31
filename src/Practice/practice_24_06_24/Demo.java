package Practice.practice_24_06_24;
 class A {
    void show() {
        System.out.println("Hi");
    }
}

 class B extends A {
    void show() {
        System.out.println("Hello");
    }
}
public class Demo {
    public static void main(String[] args) {
        A a = new B();
//        B b = new A();
        a.show();

    }
}
