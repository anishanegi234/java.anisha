// Program to demonstrate the use of char data type in Java
public class CharDataTypeDemo {

    public static void main(String[] args) {

        // Declaring char variables
        char charValue = 'A';         // Storing a single character
        char unicodeChar = '\u0041';  // Storing the Unicode value for 'A'

        // Displaying the char values
        System.out.println("Character value: " + charValue);  // Prints: A
        System.out.println("Unicode character for '\\u0041': " + unicodeChar);  // Prints: A

        // Demonstrating char arithmetic (incrementing the character)
        char nextChar = (char) (charValue + 1); // Incrementing the character 'A' to 'B'
        System.out.println("Next character after 'A': " + nextChar);  // Prints: B

        // Checking if the character is a letter or digit
        if (Character.isLetter(charValue)) {
            System.out.println(charValue + " is a letter.");
        }

        if (Character.isDigit('1')) {
            System.out.println("'1' is a digit.");
        }

        // Converting char to int (getting the ASCII value)
        int asciiValue = charValue;  // Implicit conversion to int (ASCII value)
        System.out.println("ASCII value of '" + charValue + "': " + asciiValue);  // Prints: 65 (ASCII value of 'A')
    }
}
