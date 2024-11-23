public class LoopThroughArray {
    public static void main(String[] args) {
        // Create and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // 1. Using a For Loop to loop through the array
        System.out.println("Using For Loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // 2. Using an Enhanced For Loop (For-Each) to loop through the array
        System.out.println("\nUsing Enhanced For Loop (For-Each):");
        for (int num : numbers) {
            System.out.println("Element: " + num);
        }

        // 3. Using a While Loop to loop through the array
        System.out.println("\nUsing While Loop:");
        int index = 0;
        while (index < numbers.length) {
            System.out.println("Element at index " + index + ": " + numbers[index]);
            index++;
        }
    }
}
