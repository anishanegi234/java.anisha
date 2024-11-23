import java.util.Scanner;

public class DecisionStatementsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        // if statement
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }

        // if-else statement
        if (age < 18) {
            System.out.println("You are not eligible to vote.");
        } else {
            System.out.println("You are eligible to vote.");
        }

        // if-else-if ladder
        System.out.println("\nEnter your score:");
        int score = scanner.nextInt();
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        // switch statement
        System.out.println("\nEnter a number between 1 and 7 (for days of the week):");
        int day = scanner.nextInt();
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
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }

        scanner.close();
    }
}

