public class StringOperationsDemo {
    public static void main(String[] args) {
        // Creating Strings
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "hello";

        // String Concatenation
        String concatenatedString = str1 + " " + str2;
        System.out.println("Concatenated String: " + concatenatedString);

        // Finding String Length
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Length of str2: " + str2.length());

        // Comparing Strings
        System.out.println("\nString Comparisons:");
        System.out.println("str1 equals str2: " + str1.equals(str2)); // false
        System.out.println("str1 equals str3: " + str1.equals(str3)); // false (case-sensitive)
        System.out.println("str1 equalsIgnoreCase str3: " + str1.equalsIgnoreCase(str3)); // true

        // Character at a Specific Index
        System.out.println("\nCharacter at Index 1 of str1: " + str1.charAt(1)); // 'e'

        // Substring Extraction
        System.out.println("\nSubstring of str1 from index 1 to 4: " + str1.substring(1, 4)); // "ell"

        // Checking if String Contains a Substring
        System.out.println("\nDoes str1 contain 'ell'? " + str1.contains("ell")); // true

        // String Uppercase and Lowercase Conversion
        System.out.println("\nUppercase str1: " + str1.toUpperCase());
        System.out.println("Lowercase str2: " + str2.toLowerCase());

        // Splitting a String
        String sentence = "Java is fun to learn";
        String[] words = sentence.split(" ");
        System.out.println("\nSplitting the sentence:");
        for (String word : words) {
            System.out.println(word);
        }

        // Trimming Whitespace
        String paddedString = "   Hello World!   ";
        System.out.println("\nOriginal String with whitespace: '" + paddedString + "'");
        System.out.println("Trimmed String: '" + paddedString.trim() + "'");

        // String Replacement
        System.out.println("\nReplacing 'World' with 'Java': " + str2.replace("World", "Java"));
    }
}
