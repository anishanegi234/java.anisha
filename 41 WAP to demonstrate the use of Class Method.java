// Define a class named 'MathOperations'
class MathOperations {

    // Static method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Static method to multiply two integers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Static method to find the square of a number
    public static int square(int a) {
        return a * a;
    }

    // Static method to display a message
    public static void displayMessage(String message) {
        System.out.println(message);
    }
}

public class Main {
    public static void main(String[] args) {
        // Calling static methods without creating an object of the class
        int sum = MathOperations.add(10, 20);
        System.out.println("Sum of 10 and 20: " + sum);

        int product = MathOperations.multiply(10, 5);
        System.out.println("Product of 10 and 5: " + product);

        int squareValue = MathOperations.square(7);
        System.out.println("Square of 7: " + squareValue);

        MathOperations.displayMessage("This is a static method example.");
    }
}
