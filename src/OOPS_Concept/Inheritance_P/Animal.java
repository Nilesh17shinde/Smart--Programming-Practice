package OOPS_Concept.Inheritance_P;
// Multilevel Inheritance
public class Animal {
    void dog(){
        System.out.println("Eating");
        System.out.println("Barking");
    }
}
class Cat extends Animal{
    void name(){
        System.out.println("Bably");
    }
}
class Cow extends Cat{
    void milk(){
        System.out.println("milking..");
    }

    public static void main(String[] args) {
        Cow obj=new Cow();
        obj.milk();
        obj.dog();
        obj.name();
    }
}
