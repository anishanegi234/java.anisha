// Demonstrating Memory Management in Java
public class MemoryManagementDemo {
    // Static variable stored in the Method Area
    static int staticVar = 100;

    // Instance variables stored in the heap
    private int instanceVar;

    // Constructor to initialize instance variables
    public MemoryManagementDemo(int value) {
        this.instanceVar = value;
    }

    // Method to demonstrate stack and heap interaction
    public void displayValues() {
        // Local variable stored in the stack
        int localVar = 50;

        // Display values
        System.out.println("Static Variable (Method Area): " + staticVar);
        System.out.println("Instance Variable (Heap): " + instanceVar);
        System.out.println("Local Variable (Stack): " + localVar);
    }

    public static void main(String[] args) {
        // Object creation (allocated in Heap)
        MemoryManagementDemo obj1 = new MemoryManagementDemo(10);
        MemoryManagementDemo obj2 = new MemoryManagementDemo(20);

        // Method calls (allocates memory in the stack)
        obj1.displayValues();
        obj2.displayValues();

        // Discarding references to objects (eligible for GC)
        obj1 = null;
        obj2 = null;

        // Suggest garbage collection
        System.gc();

        System.out.println("End of program. Garbage collection may have occurred.");
    }

    // Finalize method to observe garbage collection
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object with instance variable " + instanceVar + " is garbage collected.");
    }
}

