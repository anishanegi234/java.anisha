// Demonstrating Garbage Collection in Java
class GarbageCollectorDemo {
    private String name;

    public GarbageCollectorDemo(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        // This method is called before the object is garbage-collected
        System.out.println(name + " is being garbage collected!");
    }

    public static void main(String[] args) {
        // Creating objects
        GarbageCollectorDemo obj1 = new GarbageCollectorDemo("Object 1");
        GarbageCollectorDemo obj2 = new GarbageCollectorDemo("Object 2");

        // Discarding references (making objects eligible for GC)
        obj1 = null;
        obj2 = null;

        // Suggesting garbage collection
        System.out.println("Requesting Garbage Collection...");
        System.gc(); // Suggest to JVM to perform garbage collection

        // Adding a delay to ensure GC completes
        try {
            Thread.sleep(1000); // Wait 1 second for GC to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of program.");
    }
}
