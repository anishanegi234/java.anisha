public class JavaSetupChecker {
    public static void main(String[] args) {
        // Attempt to get the Java version
        try {
            String javaVersion = System.getProperty("java.version");
            if (javaVersion != null) {
                System.out.println("Java is installed. Version: " + javaVersion);
            } else {
                System.out.println("Java is not installed.");
                printInstallationInstructions();
            }
        } catch (Exception e) {
            System.out.println("Error: Unable to check Java installation.");
            printInstallationInstructions();
        }
    }

    // Method to print Java installation instructions
    private static void printInstallationInstructions() {
        System.out.println("Please install Java from the official website:");
        System.out.println("1. Go to https://www.oracle.com/java/technologies/javase-downloads.html");
        System.out.println("2. Download and install the Java Development Kit (JDK) for your operating system.");
        System.out.println("3. Set up the environment variables (JAVA_HOME and PATH) if necessary.");
        System.out.println("4. Verify the installation by running 'java -version' in your terminal or command prompt.");
    }
}
