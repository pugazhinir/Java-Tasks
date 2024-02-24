import java.util.Scanner;

public class Readbool {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a boolean value
        System.out.print("Enter a boolean value (true/false): ");
        
        // Read the input as a string
        String input = scanner.nextLine();
        
        // Convert the input to boolean
        boolean value;
        if (input.equalsIgnoreCase("true")) {
            value = true;
        } else if (input.equalsIgnoreCase("false")) {
            value = false;
        } else {
            System.out.println("Invalid input. Please enter either true or false.");
            // Close the scanner to prevent resource leak
            scanner.close();
            return;
        }
        
        // Print the boolean value
        System.out.println("You entered: " + value);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
