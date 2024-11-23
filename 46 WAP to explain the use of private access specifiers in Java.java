// Define a class named 'Person'
class Person {

    // Private variables (fields)
    private String name;
    private int age;

    // Private method (cannot be accessed outside this class)
    private void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Public constructor to initialize the person object
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public method to access private method
    public void showDetails() {
        // Accessing private method from within the class
        displayInfo();
    }

    // Public method to access private variables (getter)
    public String getName() {
        return name;
    }

    // Public method to access private variables (getter)
    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of the 'Person' class using the public constructor
        Person person1 = new Person("John", 25);

        // Accessing private variables through public getter methods
        System.out.println("Accessing private variables through getters:");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());

        // Calling the public method to display the person's details
        System.out.println("\nAccessing private method through public method:");
        person1.showDetails();  // This internally calls the private displayInfo() method
    }
}

