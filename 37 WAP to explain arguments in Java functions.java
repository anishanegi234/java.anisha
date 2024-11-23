public class FunctionArgumentsDemo {

    // 1. Method that takes two integer arguments and returns their sum
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // 2. Method that takes a String argument and prints a message
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // 3. Method that takes multiple arguments of different types and prints them
    public static void displayPersonDetails(String name, int age, double height) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
    }

    // 4. Method that accepts an array as an argument and prints all its elements
    public static void printArray(int[] numbers) {
        System.out.println("Array elements are:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 1. Calling the 'addNumbers' method and passing arguments
        int sum = addNumbers(10, 20);  // Passing 10 and 20 as arguments
        System.out.println("Sum of 10 and 20 is: " + sum);

        // 2. Calling the 'greetUser' method with an argument
        greetUser("Alice");  // Passing "Alice" as an argument

        // 3. Calling the 'displayPersonDetails' method with multiple arguments
        displayPersonDetails("John", 25, 1.75);  // Passing "John", 25, and 1.75 as arguments

        // 4. Calling the 'printArray' method with an array as an argument
        int[] numbersArray = {1, 2, 3, 4, 5};
        printArray(numbersArray);  // Passing an array of integers as an argument
    }
}

