public class FunctionOverloadingDemo {

    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public static double add(double a, double b) {
        return a + b;
    }

    // Overloaded method to concatenate two strings
    public static String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Calling the 'add' method with two integers
        System.out.println("Sum of 10 and 20: " + add(10, 20));

        // Calling the 'add' method with three integers
        System.out.println("Sum of 10, 20, and 30: " + add(10, 20, 30));

        // Calling the 'add' method with two double values
        System.out.println("Sum of 10.5 and 20.5: " + add(10.5, 20.5));

        // Calling the 'add' method with two strings
        System.out.println("Concatenation of 'Hello' and ' World!': " + add("Hello", " World!"));
    }
}
