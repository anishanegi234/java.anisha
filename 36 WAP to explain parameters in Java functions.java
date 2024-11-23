public class FunctionParametersDemo {

    // 1. Method with two parameters (int and int)
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // 2. Method with one parameter (String)
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // 3. Method with multiple parameters of different types
    public static void displayDetails(String name, int age, double salary) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }

    // 4. Method with a variable number of arguments (varargs)
    public static void printNumbers(int... numbers) {
        System.out.print("Numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Calling the 'addNumbers' method
        int sum = addNumbers(10, 20);
        System.out.println("Sum of 10 and 20 is: " + sum);

        // Calling the 'greetUser' method with one parameter
        greetUser("Alice");

        // Calling the 'displayDetails' method with three parameters
        displayDetails("John", 30, 55000.50);

        // Calling the 'printNumbers' method with a variable number of arguments
        printNumbers(1, 2, 3, 4, 5);
        printNumbers(10, 20); // You can call it with any number of arguments
    }
}
