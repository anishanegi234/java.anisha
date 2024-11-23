import java.io.*;
import java.net.*;

// Distributed Example: Simple Server
class DistributedServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Server is waiting for a connection...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected!");
            
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            
            String message = in.readLine();
            System.out.println("Message from client: " + message);
            out.println("Hello from the server!");
        } catch (IOException e) {
            System.out.println("Error in server: " + e.getMessage());
        }
    }
}

// Portable and Robust Example: Simple Program with Exception Handling
class PortableAndRobustExample {
    public static void main(String[] args) {
        System.out.println("Demonstrating Java's portability and robustness...");

        // Robust: Exception Handling
        try {
            int result = 10 / 0; // Intentional error
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        // Platform Independence
        System.out.println("This program can run on any platform with JVM!");
    }
}

// Distributed Example: Simple Client
class DistributedClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000)) {
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            out.println("Hello from the client!");
            String response = in.readLine();
            System.out.println("Response from server: " + response);
        } catch (IOException e) {
            System.out.println("Error in client: " + e.getMessage());
        }
    }
}
