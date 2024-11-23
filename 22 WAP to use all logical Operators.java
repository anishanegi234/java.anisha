public class LogicalOperatorsDemo {
    public static void main(String[] args) {
        // Variables for demonstration
        boolean condition1 = true;
        boolean condition2 = false;

        // AND (&&) Operator
        System.out.println("Logical AND (&&) Operator:");
        System.out.println("condition1 && condition2 = " + (condition1 && condition2)); // false
        System.out.println("condition1 && true = " + (condition1 && true)); // true

        // OR (||) Operator
        System.out.println("\nLogical OR (||) Operator:");
        System.out.println("condition1 || condition2 = " + (condition1 || condition2)); // true
        System.out.println("condition2 || false = " + (condition2 || false)); // false

        // NOT (!) Operator
        System.out.println("\nLogical NOT (!) Operator:");
        System.out.println("!condition1 = " + (!condition1)); // false
        System.out.println("!condition2 = " + (!condition2)); // true

        // Combined usage
        System.out.println("\nCombined Logical Operations:");
        boolean result = (condition1 || condition2) && (!condition2);
        System.out.println("(condition1 || condition2) && (!condition2) = " + result); // true
    }
}
