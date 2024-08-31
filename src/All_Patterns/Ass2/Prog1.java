package All_Patterns.Ass2;
// Abstract Vehicle class
abstract class Vehicle {
    // Fields
    private String model;
    private String color;
    private int year;

    // Constructor
    public Vehicle(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    // Abstract method for starting the vehicle
    public abstract void start();

    // Abstract method for stopping the vehicle
    public abstract void stop();
}

// Concrete Car class, inheriting from Vehicle
class Car extends Vehicle {
    // Constructor
    public Car(String model, String color, int year) {
        super(model, color, year);
    }

    // Implementing abstract start method
    public void start() {
        System.out.println("Starting the car...");
    }

    // Implementing abstract stop method
    public void stop() {
        System.out.println("Stopping the car...");
    }
}

// Main class
public class Prog1 {
    public static void main(String[] args) {
        // Creating a car object
        Car myCar = new Car("Toyota Camry", "Blue", 2022);

        // Starting and stopping the car
        myCar.start();
        myCar.stop();
    }
}
