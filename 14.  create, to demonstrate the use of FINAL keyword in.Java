// Program demonstrating the use of the final keyword in Java
public class FinalKeywordDemo {

    // Final variable: Its value cannot be changed once assigned
    public static final double PI = 3.14159;

    // Final method: Cannot be overridden by subclasses
    public final void displayMessage() {
        System.out.println("This is a final method, it cannot be overridden.");
    }

    // Final class: Cannot be subclassed
    public static final class FinalClass {
        public void printMessage() {
            System.out.println("This is a final class. It cannot be extended.");
        }
    }

    public static void main(String[] args) {
        // Demonstrating final variable
        System.out.println("The value of PI is: " + PI);

        // Demonstrating final method
        FinalKeywordDemo demo = new FinalKeywordDemo();
        demo.displayMessage();

        // Demonstrating final class
        FinalClass finalClassObj = new FinalClass();
        finalClassObj.printMessage();

        // Uncommenting the following lines will result in errors:
        // PI = 3.14;  // Error: Cannot assign a value to final variable 'PI'
        // class SubClass extends FinalClass {} // Error: Cannot subclass final class
    }
}
