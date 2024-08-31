package All_Patterns.Ass2;

// Superclass Animal
class Animal {
    // Method to make sound
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog
class Dog extends Animal {
    // Overriding makeSound method
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

// Subclass Cat
class Cat extends Animal {
    // Overriding makeSound method
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class Prog2
{
    public static void main(String[] args) {
        // Creating objects of Animal, Dog, and Cat
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Calling makeSound method on each object
        animal.makeSound(); // Output: Animal makes a sound
        dog.makeSound();    // Output: Dog barks
        cat.makeSound();    // Output: Cat meows

        // Polymorphism
        Animal anotherDog = new Dog();
        anotherDog.makeSound(); // Output: Dog barks
    }
}

