package All_Patterns.ASS1;
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}
    class Dog extends Animal{
        void sound(){
            System.out.println("Dog is Barking...");
        }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat is meowing...");
    }
}
public class Prog6 {
    public static void main(String[] args) {
    Dog dog=new Dog();
    dog.eat();
    dog.sound();
        System.out.println("-------------------------------------------------------");
    Cat cat=new Cat();
    cat.eat();
    cat.sound();
    }
}
