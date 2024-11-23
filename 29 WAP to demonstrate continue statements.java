public class ContinueStatementDemo {
    public static void main(String[] args) {
        // Using continue in a for loop
        System.out.println("Continue in a For Loop:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping iteration when i = " + i);
                continue; // Skip the current iteration when i equals 3
            }
            System.out.println("i = " + i);
        }

        // Using continue in a while loop
        System.out.println("\nContinue in a While Loop:");
        int j = 0;
        while (j < 5) {
            j++;
            if (j == 4) {
                System.out.println("Skipping iteration when j = " + j);
                continue; // Skip the current iteration when j equals 4
            }
            System.out.println("j = " + j);
        }

        // Using continue in a nested loop
        System.out.println("\nContinue in a Nested Loop:");
        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                if (b == 2) {
                    System.out.println("Skipping inner loop iteration at a = " + a + ", b = " + b);
                    continue; // Skip the current iteration of the inner loop when b equals 2
                }
                System.out.println("a = " + a + ", b = " + b);
            }
        }

        // Using continue with labels
        System.out.println("\nContinue with Labels:");
        outerLoop:
        for (int x = 1; x <= 3; x++) {
            for (int y = 1; y <= 3; y++) {
                if (y == 2) {
                    System.out.println("Skipping iteration of outer loop at x = " + x + ", y = " + y);
                    continue outerLoop; // Skip the outer loop iteration when y equals 2
                }
                System.out.println("x = " + x + ", y = " + y);
            }
        }
    }
}

