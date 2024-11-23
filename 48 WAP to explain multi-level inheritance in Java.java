// Base class
class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

// Derived class 1 (inherits from Animal)
class Mammal extends Animal {
    void mammalInfo() {
        System.out.println("Mammals give birth to live young");
    }
}

// Derived class 2 (inherits from Mammal)
class Dog extends Mammal {
    void dogInfo() {
        System.out.println("Dogs are loyal and friendly animals");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        // Create an object of the Dog class
        Dog dog = new Dog();
        
        // Calling methods from all levels of inheritance
        dog.sound();          // Method from Animal class
        dog.mammalInfo();     // Method from Mammal class
        dog.dogInfo();        // Method from Dog class
    }
}
