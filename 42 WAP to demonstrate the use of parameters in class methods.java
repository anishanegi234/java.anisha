// Define a class named 'Calculator'
class Calculator {

    // Static method with parameters to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Static method with parameters to subtract two integers
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Static method with parameters to multiply two integers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Static method with parameters to divide two integers
    public static double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;  // Casting to double to get a float result
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
    }

    // Static method with parameters to print a message and the result
    public static void printResult(String operation, int a, int b, double result) {
        System.out.println(operation + " result of " + a + " and " + b + " is: " + result);
    }
}

public class Main {
    public static void main(String[] args) {
        // Calling static methods and passing parameters to them
        int num1 = 10, num2 = 5;

        // Add two numbers
        int sum = Calculator.add(num1, num2);
        Calculator.printResult("Addition", num1, num2, sum);

        // Subtract two numbers
        int difference = Calculator.subtract(num1, num2);
        Calculator.printResult("Subtraction", num1, num2, difference);

        // Multiply two numbers
        int product = Calculator.multiply(num1, num2);
        Calculator.printResult("Multiplication", num1, num2, product);

        // Divide two numbers
        double quotient = Calculator.divide(num1, num2);
        Calculator.printResult("Division", num1, num2, quotient);

        // Division by zero case
        double zeroDivision = Calculator.divide(num1, 0);
    }
}
