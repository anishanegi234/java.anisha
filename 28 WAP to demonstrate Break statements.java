public class BreakStatementDemo {
    public static void main(String[] args) {
        // Using break in a for loop
        System.out.println("Break in a For Loop:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking the loop at i = " + i);
                break; // Exit the loop when i equals 5
            }
            System.out.println("i = " + i);
        }

        // Using break in a while loop
        System.out.println("\nBreak in a While Loop:");
        int j = 1;
        while (j <= 10) {
            if (j == 4) {
                System.out.println("Breaking the loop at j = " + j);
                break; // Exit the loop when j equals 4
            }
            System.out.println("j = " + j);
            j++;
        }

        // Using break in a nested loop
        System.out.println("\nBreak in a Nested Loop:");
        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                if (b == 2) {
                    System.out.println("Breaking inner loop at a = " + a + ", b = " + b);
                    break; // Exit the inner loop when b equals 2
                }
                System.out.println("a = " + a + ", b = " + b);
            }
        }

        // Using break in a switch-case
        System.out.println("\nBreak in a Switch-Case:");
        int day = 3; // Example day
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}

