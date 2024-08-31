package OOPS_Concept.Abstraction_P;

interface Animal{
    void eat();
    void sleep();
}
interface cat3{
    void run();
    void sound();
}
class Catn implements Animal,cat3{

    @Override
    public void eat() {
        System.out.println("Cat is eating milk");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }

    @Override
    public void run() {
        System.out.println("Cat running");
    }

    @Override
    public void sound() {
        System.out.println("meau...");
    }
}
public class Multiple_Inheri {
    public static void main(String[] args) {
        Catn obj=new Catn();
        obj.eat();
        obj.run();
        obj.sleep();
        obj.sound();
    }
}
