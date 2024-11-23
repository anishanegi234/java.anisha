// Interface 1
interface Animal {
    void sound();  // Abstract method
}

// Interface 2
interface Bird {
    void fly();    // Abstract method
}

// Class that implements both Animal and Bird interfaces
class Sparrow implements Animal, Bird {
    // Implementing the sound method from Animal interface
    public void sound() {
        System.out.println("Sparrow chirps");
    }

    // Implementing the fly method from Bird interface
    public void fly() {
        System.out.println("Sparrow flies");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        // Create an object of Sparrow
        Sparrow sparrow = new Sparrow();
        
        // Calling methods from both interfaces
        sparrow.sound();   // Method from Animal interface
        sparrow.fly();     // Method from Bird interface
    }
}

