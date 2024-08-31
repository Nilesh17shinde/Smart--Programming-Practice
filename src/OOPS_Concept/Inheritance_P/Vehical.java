package OOPS_Concept.Inheritance_P;

public class Vehical {
    void Bajaj(){
        System.out.println("Pulser");
    }
}
class Types extends Vehical{
    void cc(){
        System.out.println("150cc");
    }
}
class Model extends Vehical{
    void no(){
        System.out.println("PQRst002589");
    }

    public static void main(String[] args) {
        Types obj1=new Types();
        obj1.Bajaj();
        obj1.cc();

        Model obj2=new Model();
        obj2.no();
        obj2.Bajaj();
    }
}
