// Define a class named 'Car' with a finalize method
class Car {

    // Instance variable
    String brand;

    // Constructor to initialize the Car object
    public Car(String brand) {
        this.brand = brand;
        System.out.println("Car object created for brand: " + brand);
    }

    // Overriding the finalize method to demonstrate cleanup
    @Override
    protected void finalize() throws Throwable {
        try {
            // Perform cleanup tasks, such as closing resources or releasing memory
            System.out.println("Cleaning up resources for Car object with brand: " + brand);
        } finally {
            // Always call the superclass's finalize method to ensure proper cleanup
            super.finalize();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a new Car object
        Car car1 = new Car("Toyota");
        Car car2 = new Car("Honda");

        // Set objects to null for garbage collection to happen (optional)
        car1 = null;
        car2 = null;

        // Suggesting garbage collection, though it happens automatically
        System.gc(); // This is a hint to the JVM to run the garbage collector

        // Wait for a while to allow garbage collection to happen (not recommended for production code)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
