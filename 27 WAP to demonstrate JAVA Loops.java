public class LoopsDemo {
    public static void main(String[] args) {
        // 1. For Loop: Print numbers from 1 to 5
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }

        // 2. While Loop: Print numbers from 5 to 1
        System.out.println("\nWhile Loop:");
        int j = 5;
        while (j > 0) {
            System.out.println("Number: " + j);
            j--;
        }

        // 3. Do-While Loop: Print numbers from 1 to 3
        System.out.println("\nDo-While Loop:");
        int k = 1;
        do {
            System.out.println("Number: " + k);
            k++;
        } while (k <= 3);

        // 4. Nested Loop: Print a multiplication table for numbers 1 to 3
        System.out.println("\nNested Loop (Multiplication Table):");
        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                System.out.print(a * b + "\t");
            }
            System.out.println();
        }

        // 5. Enhanced For Loop: Sum elements in an array
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        System.out.println("\nEnhanced For Loop:");
        for (int num : numbers) {
            System.out.println("Processing number: " + num);
            sum += num;
        }
        System.out.println("Sum of array elements: " + sum);
    }
}
