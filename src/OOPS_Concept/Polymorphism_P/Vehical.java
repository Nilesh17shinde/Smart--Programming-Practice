package OOPS_Concept.Polymorphism_P;
//Method Overriding

class Bike{
    public void shine(String Model,String serialNo){
        System.out.println("Model: "+Model+" SerialNo: "+serialNo);
    }
}
class Bike1 extends Bike{
    public void shine(String Model,String serialNo){
        System.out.println("Model: "+Model+" SerialNo: "+serialNo);
    }
}
public class Vehical {
    public static void main(String[] args) {
        Bike1 obj=new Bike1();
        obj.shine("cb shine","SH857958Q");
    }
}
