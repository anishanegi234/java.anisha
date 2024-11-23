// Define a class named 'Car'
class Car {

    // Instance variables (fields)
    String brand;
    String model;
    int year;

    // Default constructor (No parameters)
    public Car() {
        // Initializing the fields with default values
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }

    // Parameterized constructor (Takes parameters)
    public Car(String brand, String model, int year) {
        // Initializing the fields with values passed from the constructor
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object using the default constructor
        Car car1 = new Car();
        car1.displayDetails();  // Display the default car details

        // Create an object using the parameterized constructor
        Car car2 = new Car("Toyota", "Corolla", 2020);
        car2.displayDetails();  // Display the car details for car2

        // Create another object using the parameterized constructor
        Car car3 = new Car("Honda", "Civic", 2022);
        car3.displayDetails();  // Display the car details for car3
    }
}
