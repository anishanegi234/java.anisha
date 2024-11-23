// Program to demonstrate the use of String data type in Java
public class StringDataTypeDemo {

    public static void main(String[] args) {

        // Declaring and initializing String variables
        String str1 = "Hello, ";         // A simple string
        String str2 = "World!";          // Another string
        String str3 = "Java Programming"; // A longer string

        // Concatenating strings using + operator
        String result = str1 + str2;  // Concatenates "Hello, " and "World!"
        System.out.println("Concatenated String: " + result); // Prints: Hello, World!

        // Using StringBuilder for efficient string concatenation
        StringBuilder stringBuilder = new StringBuilder(str1);
        stringBuilder.append(str2);
        System.out.println("Concatenated using StringBuilder: " + stringBuilder.toString()); // Prints: Hello, World!

        // Finding the length of a string
        System.out.println("Length of str3: " + str3.length()); // Prints: 17

        // Accessing a specific character in a string (indexing starts at 0)
        char ch = str3.charAt(5); // Get character at index 5 (space in this case)
        System.out.println("Character at index 5: " + ch); // Prints: space

        // Converting string to lowercase and uppercase
        System.out.println("Lowercase: " + str3.toLowerCase()); // Prints: java programming
        System.out.println("Uppercase: " + str3.toUpperCase()); // Prints: JAVA PROGRAMMING

        // Checking if two strings are equal (case-sensitive)
        boolean isEqual = str1.equals("Hello, ");
        System.out.println("Is str1 equal to 'Hello, ': " + isEqual); // Prints: true

        // Checking if two strings are equal (case-insensitive)
        boolean isEqualIgnoreCase = str2.equalsIgnoreCase("world!");
        System.out.println("Is str2 equal to 'world!' (ignore case): " + isEqualIgnoreCase); // Prints: true

        // Extracting a substring from a string
        String substring = str3.substring(5, 17); // Extract substring from index 5 to 17
        System.out.println("Substring of str3: " + substring); // Prints: Programming

        // Checking if a string contains a certain substring
        boolean contains = str3.contains("Java");
        System.out.println("Does str3 contain 'Java'? " + contains); // Prints: true

        // Replacing characters in a string
        String replacedString = str3.replace("Java", "C++");
        System.out.println("Replaced String: " + replacedString); // Prints: C++ Programming
    }
}
