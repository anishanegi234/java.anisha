// Demonstrating Java Buzzwords
class Greeting {
    private String message;

    // Constructor (Object-Oriented feature)
    public Greeting(String message) {
        this.message = message;
    }

    public void displayMessage() {
        System.out.println(message);
    }
}

// Multithreading example
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
}

public class JavaBuzzwordsDemo {
    public static void main(String[] args) {
        // Object-Oriented: Creating and using objects
        Greeting greeting = new Greeting("Welcome to Java Buzzwords Demo!");
        greeting.displayMessage();

        // Multithreading
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        thread1.start();
        thread2.start();

        // Exception handling (Robustness)
        try {
            int result = 10 / 0; // This will throw an exception
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        // Platform Independence: Runs on any JVM
        System.out.println("This code is platform-independent!");
    }
}
