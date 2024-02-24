import java.util.Scanner;

public class Readuser {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter their name
        System.out.print("Please enter your name: ");
        
        // Read the name entered by the user
        String name = scanner.nextLine();
        
        // Print a greeting message with the user's name
        System.out.println("Hello, " + name + "! Welcome!");
        
        // Close the Scanner object
        scanner.close();
    }
}
