package OOPS_Concept.Abstraction_P;
abstract class Vehical{
    abstract void start(String name);
}
class Bike extends Vehical{

    @Override
    void start(String name) {
        System.out.println(name+" Start with Kick");
    }
}
class car extends Vehical{

    @Override
    void start(String name) {
        System.out.println(name+" self start");
    }
}
public class Main_Abstract {
    public static void main(String[] args) {
        Bike obj=new Bike();
        obj.start("Shine");
        car obj1=new car();
        obj1.start("Swift");
    }
}
