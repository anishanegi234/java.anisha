// Superclass: Animal
class Animal {
    // Fields
    String name;
    int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public void eat() {
        System.out.println(name + " is eating.");
    }

    // Method
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Subclass: Dog (Inherits from Animal)
class Dog extends Animal {

    // Constructor
    public Dog(String name, int age) {
        // Calling superclass constructor
        super(name, age);
    }

    // Overriding the eat method
    @Override
    public void eat() {
        System.out.println(name + " is eating dog food.");
    }

    // Method specific to Dog class
    public void bark() {
        System.out.println(name + " is barking.");
    }
}

// Subclass: Cat (Inherits from Animal)
class Cat extends Animal {

    // Constructor
    public Cat(String name, int age) {
        // Calling superclass constructor
        super(name, age);
    }

    // Overriding the eat method
    @Override
    public void eat() {
        System.out.println(name + " is eating cat food.");
    }

    // Method specific to Cat class
    public void meow() {
        System.out.println(name + " is meowing.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating Dog object
        Dog dog = new Dog("Buddy", 3);
        dog.eat();  // Calls the overridden method in Dog class
        dog.sleep(); // Inherited from Animal class
        dog.bark();  // Specific to Dog class

        System.out.println();

        // Creating Cat object
        Cat cat = new Cat("Whiskers", 2);
        cat.eat();  // Calls the overridden method in Cat class
        cat.sleep(); // Inherited from Animal class
        cat.meow();  // Specific to Cat class
    }
}
