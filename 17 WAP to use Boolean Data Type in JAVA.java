// Program to demonstrate the use of boolean data type in Java
public class BooleanDataTypeDemo {

    public static void main(String[] args) {

        // Declaring boolean variables
        boolean isJavaFun = true;   // Boolean variable holding true
        boolean isFishTasty = false; // Boolean variable holding false

        // Displaying the boolean values
        System.out.println("Is Java fun? " + isJavaFun);   // Prints: true
        System.out.println("Is fish tasty? " + isFishTasty); // Prints: false

        // Using boolean values in an if-else statement
        if (isJavaFun) {
            System.out.println("Yes, Java is fun!"); // This will execute because isJavaFun is true
        } else {
            System.out.println("No, Java is not fun.");
        }

        if (isFishTasty) {
            System.out.println("Yes, fish is tasty.");
        } else {
            System.out.println("No, fish is not tasty."); // This will execute because isFishTasty is false
        }

        // Performing logical operation with booleans
        boolean result = isJavaFun && isFishTasty; // AND operation
        System.out.println("Is Java fun AND is fish tasty? " + result); // Prints: false

        result = isJavaFun || isFishTasty; // OR operation
        System.out.println("Is Java fun OR is fish tasty? " + result); // Prints: true
    }
}
