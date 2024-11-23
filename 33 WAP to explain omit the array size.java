public class OmitArraySize {
    public static void main(String[] args) {
        // 1. Create and initialize an array without specifying the size
        int[] numbers = {10, 20, 30, 40, 50}; // Array size is inferred

        // Display the array elements
        System.out.println("Array elements (using omitted size):");
        for (int num : numbers) {
            System.out.println(num);
        }

        // 2. Create and initialize a String array without specifying the size
        String[] fruits = {"Apple", "Banana", "Cherry"};

        // Display the array elements
        System.out.println("\nString Array elements (using omitted size):");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
