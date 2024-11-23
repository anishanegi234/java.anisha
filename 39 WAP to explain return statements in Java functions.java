public class ReturnStatementDemo {

    // Method with an int return type
    public static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;  // Return the sum to the caller
    }

    // Method with a double return type
    public static double calculateArea(double radius) {
        double area = Math.PI * radius * radius;
        return area;  // Return the calculated area
    }

    // Method with a String return type
    public static String greetUser(String name) {
        return "Hello, " + name + "!";  // Return a greeting message
    }

    // Method with void return type, using return to exit early
    public static void displayMessage(String message) {
        if (message == null || message.isEmpty()) {
            System.out.println("No message to display.");
            return;  // Exit early if the message is null or empty
        }
        System.out.println(message);
    }

    public static void main(String[] args) {
        // Calling the 'addNumbers' method and printing the returned value
        int sum = addNumbers(10, 20);
        System.out.println("Sum of 10 and 20: " + sum);

        // Calling the 'calculateArea' method and printing the returned value
        double area = calculateArea(7.5);
        System.out.println("Area of circle with radius 7.5: " + area);

        // Calling the 'greetUser' method and printing the returned greeting
        String greeting = greetUser("Alice");
        System.out.println(greeting);

        // Calling the 'displayMessage' method with a valid message
        displayMessage("Welcome to Java!");
        
        // Calling the 'displayMessage' method with an empty message
        displayMessage("");  // This will trigger the early return
    }
}
