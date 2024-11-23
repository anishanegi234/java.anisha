import java.util.Scanner;

public class ChangeArrayElement {
    public static void main(String[] args) {
        // Create an array and initialize it with values
        int[] numbers = {10, 20, 30, 40, 50};

        // Display the original array
        System.out.println("Original Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Get input from the user to change an array element
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the index of the element you want to change (0 to 4):");
        int index = scanner.nextInt();

        // Validate index
        if (index < 0 || index >= numbers.length) {
            System.out.println("Invalid index! Please run the program again.");
        } else {
            System.out.println("Enter the new value:");
            int newValue = scanner.nextInt();

            // Change the value at the specified index
            numbers[index] = newValue;

            // Display the modified array
            System.out.println("\nModified Array:");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }
}
