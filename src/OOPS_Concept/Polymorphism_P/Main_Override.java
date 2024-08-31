package OOPS_Concept.Polymorphism_P;
class Animal1 {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal1 {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal1 {
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}

public class Main_Override {
    public static void main(String[] args) {
        Animal1 animal = new Animal1();
        animal.makeSound(); // Output: The animal makes a sound

        Dog dog = new Dog();
        dog.makeSound(); // Output: The dog barks

        Cat cat = new Cat();
        cat.makeSound(); // Output: The cat meows
    }
}
