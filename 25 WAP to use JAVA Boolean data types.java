public class BooleanDemo {
    public static void main(String[] args) {
        // Declaring boolean variables
        boolean isJavaFun = true;
        boolean isRaining = false;

        // Printing boolean values
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is it raining? " + isRaining);

        // Using boolean in conditional statements
        if (isJavaFun) {
            System.out.println("Yes, Java is fun!");
        } else {
            System.out.println("No, Java is not fun.");
        }

        // Logical operations with boolean
        boolean condition1 = true;
        boolean condition2 = false;

        System.out.println("\nLogical Operations:");
        System.out.println("condition1 AND condition2: " + (condition1 && condition2)); // false
        System.out.println("condition1 OR condition2: " + (condition1 || condition2)); // true
        System.out.println("NOT condition1: " + (!condition1)); // false

        // Boolean from comparisons
        int num1 = 10;
        int num2 = 20;

        boolean isEqual = num1 == num2; // false
        boolean isGreater = num1 > num2; // false
        boolean isLess = num1 < num2; // true

        System.out.println("\nComparison Operations:");
        System.out.println("Is num1 equal to num2? " + isEqual);
        System.out.println("Is num1 greater than num2? " + isGreater);
        System.out.println("Is num1 less than num2? " + isLess);

        // Combining conditions
        System.out.println("\nCombining Conditions:");
        boolean combinedCondition = (num1 < num2) && isJavaFun; // true
        System.out.println("num1 < num2 AND isJavaFun: " + combinedCondition);

        // Boolean in a loop
        int counter = 0;
        boolean keepGoing = true;

        System.out.println("\nUsing boolean in a loop:");
        while (keepGoing) {
            System.out.println("Counter: " + counter);
            counter++;
            if (counter >= 5) {
                keepGoing = false;
            }
        }
    }
}
