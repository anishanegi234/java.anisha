public class ArrayDemo {
    public static void main(String[] args) {
        // 1. Creating and assigning values to an integer array
        int[] intArray = {10, 20, 30, 40, 50};
        System.out.println("Integer Array:");
        for (int num : intArray) {
            System.out.println(num);
        }

        // 2. Creating and assigning values to a string array
        String[] stringArray = {"Apple", "Banana", "Cherry"};
        System.out.println("\nString Array:");
        for (String fruit : stringArray) {
            System.out.println(fruit);
        }

        // 3. Creating an array and assigning values later
        double[] doubleArray = new double[5];
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = i * 1.5; // Assigning values
        }
        System.out.println("\nDouble Array:");
        for (double val : doubleArray) {
            System.out.println(val);
        }

        // 4. Displaying a 2D array
        int[][] twoDArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("\n2D Array:");
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }

        // 5. Displaying a 3D array
        int[][][] threeDArray = {
            {
                {1, 2}, 
                {3, 4}
            },
            {
                {5, 6}, 
                {7, 8}
            }
        };
        System.out.println("\n3D Array:");
        for (int i = 0; i < threeDArray.length; i++) {
            for (int j = 0; j < threeDArray[i].length; j++) {
                for (int k = 0; k < threeDArray[i][j].length; k++) {
                    System.out.print(threeDArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
