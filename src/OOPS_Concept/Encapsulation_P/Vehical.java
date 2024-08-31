package OOPS_Concept.Encapsulation_P;
interface car{
    void start();
}
interface bike{
    void strat1();
}
public class Vehical implements car{
    public void start(){
        System.out.println("Start with key");
    }
    public void start1(){
        System.out.println("start with kick");
    }
    public static void main(String[] args) {
Vehical obj=new Vehical();
obj.start1();
obj.start();
    }


}
