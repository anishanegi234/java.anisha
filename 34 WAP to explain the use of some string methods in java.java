public class StringMethodsDemo {
    public static void main(String[] args) {
        // Initialize some String variables
        String str1 = "Hello, World!";
        String str2 = "Java Programming";

        // 1. length() - Returns the length of the string
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Length of str2: " + str2.length());

        // 2. charAt() - Returns the character at the specified index
        System.out.println("\nCharacter at index 4 of str1: " + str1.charAt(4));
        System.out.println("Character at index 2 of str2: " + str2.charAt(2));

        // 3. substring() - Extracts a substring from the string
        System.out.println("\nSubstring of str1 (from index 7 to end): " + str1.substring(7));
        System.out.println("Substring of str2 (from index 0 to 4): " + str2.substring(0, 4));

        // 4. toLowerCase() - Converts the string to lowercase
        System.out.println("\nstr1 in lowercase: " + str1.toLowerCase());
        System.out.println("str2 in lowercase: " + str2.toLowerCase());

        // 5. toUpperCase() - Converts the string to uppercase
        System.out.println("\nstr1 in uppercase: " + str1.toUpperCase());
        System.out.println("str2 in uppercase: " + str2.toUpperCase());

        // 6. contains() - Checks if the string contains a specified sequence of characters
        System.out.println("\nDoes str1 contain 'World'? " + str1.contains("World"));
        System.out.println("Does str2 contain 'Java'? " + str2.contains("Java"));

        // 7. equals() - Compares two strings for equality (case-sensitive)
        System.out.println("\nDoes str1 equal str2? " + str1.equals(str2));

        // 8. equalsIgnoreCase() - Compares two strings for equality (case-insensitive)
        System.out.println("\nDoes str1 equal str2 (ignore case)? " + str1.equalsIgnoreCase(str2));

        // 9. trim() - Removes leading and trailing whitespace from the string
        String str3 = "  Java Programming  ";
        System.out.println("\nTrimmed str3: '" + str3.trim() + "'");

        // 10. replace() - Replaces all occurrences of a specified character or substring
        System.out.println("\nReplace 'o' with '0' in str1: " + str1.replace('o', '0'));
        System.out.println("Replace 'Java' with 'C++' in str2: " + str2.replace("Java", "C++"));

        // 11. split() - Splits the string into an array based on a delimiter
        String sentence = "This is a Java tutorial";
        String[] words = sentence.split(" ");
        System.out.println("\nSplitting sentence into words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
