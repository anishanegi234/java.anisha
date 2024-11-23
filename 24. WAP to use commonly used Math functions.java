public class MathFunctionsDemo {
    public static void main(String[] args) {
        // Variables for demonstration
        double num1 = 25.0;
        double num2 = -9.0;
        double num3 = 2.5;

        // Absolute Value
        System.out.println("Absolute value of num2: " + Math.abs(num2)); // 9.0

        // Square Root
        System.out.println("Square root of num1: " + Math.sqrt(num1)); // 5.0

        // Power
        System.out.println("num1 raised to the power of num3: " + Math.pow(num1, num3)); // 15625.0

        // Maximum and Minimum
        System.out.println("Maximum of num1 and num2: " + Math.max(num1, num2)); // 25.0
        System.out.println("Minimum of num1 and num2: " + Math.min(num1, num2)); // -9.0

        // Rounding Functions
        double value = 7.85;
        System.out.println("\nRounding Functions:");
        System.out.println("Ceiling of value: " + Math.ceil(value)); // 8.0
        System.out.println("Floor of value: " + Math.floor(value)); // 7.0
        System.out.println("Round of value: " + Math.round(value)); // 8

        // Trigonometric Functions
        double angle = 45.0; // Angle in degrees
        double radians = Math.toRadians(angle); // Convert degrees to radians
        System.out.println("\nTrigonometric Functions for 45 degrees:");
        System.out.println("Sine: " + Math.sin(radians));
        System.out.println("Cosine: " + Math.cos(radians));
        System.out.println("Tangent: " + Math.tan(radians));

        // Exponential and Logarithmic Functions
        System.out.println("\nExponential and Logarithmic Functions:");
        System.out.println("Exponential of 2: " + Math.exp(2)); // e^2
        System.out.println("Natural logarithm of num1: " + Math.log(num1)); // ln(25)
        System.out.println("Base-10 logarithm of num1: " + Math.log10(num1)); // log10(25)

        // Random Number
        System.out.println("\nRandom Number:");
        double randomNum = Math.random(); // Generates a random number between 0.0 and 1.0
        System.out.println("Random number: " + randomNum);
        System.out.println("Random number between 1 and 100: " + (1 + (int)(randomNum * 100))); // 1 to 100
    }
}
