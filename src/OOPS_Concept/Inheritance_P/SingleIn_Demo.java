package OOPS_Concept.Inheritance_P;
//Single Inheritance
public class SingleIn_Demo {
    void eat(){
        System.out.println("Eating..");
    }
}
class Dog extends SingleIn_Demo{
    void bark(){
        System.out.println("barking");
    }

    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.bark();
        obj.eat();
    }
}
