// Define a class named 'Car'
class Car {
    // Instance variables (fields)
    String brand;
    String model;
    int year;

    // Constructor to initialize the object
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display the car details
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    // Method to start the car
    public void start() {
        System.out.println("The " + brand + " " + model + " is starting...");
    }

    // Method to stop the car
    public void stop() {
        System.out.println("The " + brand + " " + model + " is stopping...");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object (instance) of the 'Car' class
        Car myCar = new Car("Toyota", "Corolla", 2020);
        
        // Call methods on the object
        myCar.displayDetails();  // Display car details
        myCar.start();           // Start the car
        myCar.stop();            // Stop the car
    }
}

