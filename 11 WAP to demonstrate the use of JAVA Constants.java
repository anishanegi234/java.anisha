// Program to demonstrate the use of constants in Java
public class JavaConstantsDemo {
    // Defining a constant using the final keyword
    public static final double PI = 3.14159; // A constant for the value of Pi

    public static void main(String[] args) {
        // Using the constant in calculations
        double radius = 5.0; // Radius of a circle
        double area = PI * radius * radius; // Area of the circle

        // Displaying the constant and calculated area
        System.out.println("The value of PI is: " + PI);
        System.out.println("The radius of the circle is: " + radius);
        System.out.println("The area of the circle is: " + area);

        // Uncommenting the next line will result in an error because constants cannot be modified
        // PI = 3.14; // Error: cannot assign a value to final variable 'PI'
    }
}
