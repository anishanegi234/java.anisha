// Program to demonstrate the use of all arithmetic operators in Java
public class ArithmeticOperatorsDemo {

    public static void main(String[] args) {

        // Declaring and initializing variables
        int a = 10;
        int b = 5;

        // Addition
        int sum = a + b;
        System.out.println("Addition: " + a + " + " + b + " = " + sum);

        // Subtraction
        int difference = a - b;
        System.out.println("Subtraction: " + a + " - " + b + " = " + difference);

        // Multiplication
        int product = a * b;
        System.out.println("Multiplication: " + a + " * " + b + " = " + product);

        // Division
        int quotient = a / b;
        System.out.println("Division: " + a + " / " + b + " = " + quotient);

        // Modulus (remainder)
        int remainder = a % b;
        System.out.println("Modulus: " + a + " % " + b + " = " + remainder);

        // Using arithmetic operators with floating-point numbers
        double x = 10.5;
        double y = 3.2;

        // Addition with floating-point numbers
        double floatSum = x + y;
        System.out.println("Floating-point Addition: " + x + " + " + y + " = " + floatSum);

        // Division with floating-point numbers
        double floatQuotient = x / y;
        System.out.println("Floating-point Division: " + x + " / " + y + " = " + floatQuotient);
    }
}
