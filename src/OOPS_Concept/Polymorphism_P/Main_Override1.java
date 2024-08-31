package OOPS_Concept.Polymorphism_P;
class Vehical1{
    public void type(){
        System.out.println("Car / Bike");
    }
}
class Bike2 extends Vehical1{
    public void start(){
        System.out.println("Start with Kick");
    }
}
class Car2 extends Vehical1{
    public void start(){
        System.out.println("start with key");
    }
}
public class Main_Override1 {
    public static void main(String[] args) {
        Car2 obj1=new Car2();
        obj1.type();
        obj1.start();
        Bike2 obj=new Bike2();
        obj.start();
    }
}
