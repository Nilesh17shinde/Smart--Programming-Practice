package All_Patterns.Ass3;

class Car {
    // Attributes (private to encapsulate)
    private String make;
    private String model;
    private int year;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getter methods (to access the attributes)
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // Setter methods (to modify the attributes)
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Example of additional method using encapsulated data
    public void displayCarInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class Prog5 {
    // Main method for testing
    public static void main(String[] args) {
        // Create a new Car object
        Car myCar = new Car("Toyota", "Camry", 2020);

        // Accessing attributes using getter methods
       /* System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());*/

        // Modifying attributes using setter methods
        myCar.setYear(2021);
        myCar.displayCarInfo();
    }
}
