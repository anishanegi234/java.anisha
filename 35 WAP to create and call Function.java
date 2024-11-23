public class FunctionDemo {

    // 1. Creating a method to add two integers and return the result
    public static int add(int a, int b) {
        return a + b;
    }

    // 2. Creating a method to display a message
    public static void displayMessage(String message) {
        System.out.println(message);
    }

    // 3. Creating a method that returns the largest of three numbers
    public static int findLargest(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }

    public static void main(String[] args) {
        // Calling the 'add' method and printing the result
        int sum = add(10, 20);
        System.out.println("Sum of 10 and 20 is: " + sum);

        // Calling the 'displayMessage' method
        displayMessage("Welcome to Java Functions!");

        // Calling the 'findLargest' method
        int largest = findLargest(12, 45, 30);
        System.out.println("The largest number is: " + largest);
    }
}
