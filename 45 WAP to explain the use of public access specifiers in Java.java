// Define a public class named 'Car'
public class Car {

    // Public variables
    public String brand;
    public String model;
    public int year;

    // Public constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Public method to display car details
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Another class to demonstrate accessing public members
public class Main {
    public static void main(String[] args) {
        // Creating an object of the 'Car' class using the public constructor
        Car car1 = new Car("Toyota", "Corolla", 2020);

        // Accessing public variables
        System.out.println("Accessing Public Variables:");
        System.out.println("Brand: " + car1.brand);
        System.out.println("Model: " + car1.model);
        System.out.println("Year: " + car1.year);

        // Calling a public method
        System.out.println("\nAccessing Public Method:");
        car1.displayDetails();  // Accessing the public method to display car details
    }
}
