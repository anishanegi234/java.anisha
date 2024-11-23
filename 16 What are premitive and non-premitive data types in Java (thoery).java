// Program to demonstrate the use of primitive and non-primitive data types in Java
public class DataTypesDemo {

    // Primitive Data Types
    public static void main(String[] args) {

        // Primitive Data Types
        byte byteValue = 120;           // 1 byte
        short shortValue = 15000;       // 2 bytes
        int intValue = 100000;          // 4 bytes
        long longValue = 10000000000L;  // 8 bytes
        float floatValue = 3.14f;       // 4 bytes
        double doubleValue = 3.14159;   // 8 bytes
        char charValue = 'A';           // 2 bytes
        boolean boolValue = true;       // 1 bit

        // Non-Primitive Data Types
        String stringValue = "Hello, World!"; // A sequence of characters
        int[] arrayValue = {1, 2, 3, 4, 5};  // An array of integers

        // Displaying Primitive Data Types
        System.out.println("Primitive Data Types:");
        System.out.println("Byte value: " + byteValue);
        System.out.println("Short value: " + shortValue);
        System.out.println("Integer value: " + intValue);
        System.out.println("Long value: " + longValue);
        System.out.println("Float value: " + floatValue);
        System.out.println("Double value: " + doubleValue);
        System.out.println("Character value: " + charValue);
        System.out.println("Boolean value: " + boolValue);

        // Displaying Non-Primitive Data Types
        System.out.println("\nNon-Primitive Data Types:");
        System.out.println("String value: " + stringValue);
        System.out.println("Array values: ");
        for (int i : arrayValue) {
            System.out.print(i + " ");  // Displaying elements of the array
        }
    }
}
