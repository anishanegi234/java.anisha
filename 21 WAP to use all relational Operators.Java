// Program to demonstrate the use of all relational operators in Java
public class RelationalOperatorsDemo {

    public static void main(String[] args) {

        // Declaring and initializing variables
        int a = 10;
        int b = 5;
        int c = 10;

        // Equal to (==)
        boolean isEqual = (a == b);
        System.out.println("Is a equal to b? " + isEqual); // Prints: false

        // Not equal to (!=)
        boolean isNotEqual = (a != b);
        System.out.println("Is a not equal to b? " + isNotEqual); // Prints: true

        // Greater than (>)
        boolean isGreaterThan = (a > b);
        System.out.println("Is a greater than b? " + isGreaterThan); // Prints: true

        // Less than (<)
        boolean isLessThan = (a < b);
        System.out.println("Is a less than b? " + isLessThan); // Prints: false

        // Greater than or equal to (>=)
        boolean isGreaterOrEqual = (a >= c);
        System.out.println("Is a greater than or equal to c? " + isGreaterOrEqual); // Prints: true

        // Less than or equal to (<=)
        boolean isLessOrEqual = (b <= c);
        System.out.println("Is b less than or equal to c? " + isLessOrEqual); // Prints: true

        // Using relational operators with floating-point numbers
        double x = 15.5;
        double y = 10.0;

        // Greater than (>)
        boolean isGreaterThanFloat = (x > y);
        System.out.println("Is x greater than y? " + isGreaterThanFloat); // Prints: true

        // Less than (<)
        boolean isLessThanFloat = (x < y);
        System.out.println("Is x less than y? " + isLessThanFloat); // Prints: false
    }
}
