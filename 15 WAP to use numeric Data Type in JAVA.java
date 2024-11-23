// Program to demonstrate the use of numeric data types in Java
public class NumericDataTypes {

    public static void main(String[] args) {

        // Integral data types
        byte byteValue = 100;        // 1 byte, range: -128 to 127
        short shortValue = 10000;    // 2 bytes, range: -32,768 to 32,767
        int intValue = 100000;       // 4 bytes, range: -2^31 to 2^31 - 1
        long longValue = 100000L;    // 8 bytes, range: -2^63 to 2^63 - 1

        // Floating-point data types
        float floatValue = 3.14f;    // 4 bytes, range: 1.4E-45 to 3.4E+38
        double doubleValue = 3.14159; // 8 bytes, range: 4.9E-324 to 1.8E+308

        // Displaying values of each variable
        System.out.println("Byte value: " + byteValue);         // 100
        System.out.println("Short value: " + shortValue);       // 10000
        System.out.println("Integer value: " + intValue);       // 100000
        System.out.println("Long value: " + longValue);         // 100000
        System.out.println("Float value: " + floatValue);       // 3.14
        System.out.println("Double value: " + doubleValue);     // 3.14159

        // Performing arithmetic operations using numeric types
        int sum = intValue + byteValue; // Adding int and byte
        double division = doubleValue / floatValue; // Dividing double and float

        // Displaying the result of arithmetic operations
        System.out.println("Sum of int and byte: " + sum);        // 100100
        System.out.println("Result of double / float: " + division); // 1000.0
    }
}

