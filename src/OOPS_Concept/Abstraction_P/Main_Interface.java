package OOPS_Concept.Abstraction_P;
interface Vehical1{
    void start();
}
class Car2 implements Vehical1{
    public void start(){
        System.out.println("Drive sefly");
    }
}
public class Main_Interface {
    public static void main(String[] args) {
        Car2 obj=new Car2();
        obj.start();
    }
}
