import java.util.Scanner;

public class Readcharacter {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a single character
        System.out.print("Enter a single character: ");
        
        // Read the input as a string
        String input = scanner.nextLine();
        
        // Check if the input is a single character
        if (input.length() == 1) {
            char character = input.charAt(0);
            System.out.println("You entered: " + character);
        } else {
            System.out.println("Please enter only a single character.");
        }
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
