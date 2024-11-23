// Demonstrating JVM Architecture Components
public class JVMArchitectureDemo {
    // Static variable (Method Area)
    static int staticVar = 100;

    // Instance variable (Heap)
    private int instanceVar;

    // Constructor to initialize instance variables
    public JVMArchitectureDemo(int value) {
        this.instanceVar = value;
    }

    public void displayValues() {
        // Local variable (Stack)
        int localVar = 50;

        // Program Counter (PC): Tracks this execution point
        System.out.println("Static Variable (Method Area): " + staticVar);
        System.out.println("Instance Variable (Heap): " + instanceVar);
        System.out.println("Local Variable (Stack): " + localVar);
    }

    public static void main(String[] args) {
        // Object creation (Heap)
        JVMArchitectureDemo obj = new JVMArchitectureDemo(10);

        // Method call (Stack frame created)
        obj.displayValues();

        // Native Method Example (Native Method Stack)
        System.out.println("Current time in milliseconds (Native Method): " + System.currentTimeMillis());

        // Triggering garbage collection (Heap)
        obj = null;
        System.gc();

        System.out.println("End of program.");
    }

    @Override
    protected void finalize() throws Throwable {
        // Called by the Garbage Collector before object removal
        System.out.println("Garbage collector called!");
    }
}
