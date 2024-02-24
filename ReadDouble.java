import java.util.Scanner;

public class ReadDouble {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a double value
        System.out.print("Please enter a double value: ");
        
        // Read the double value entered by the user
        double value = scanner.nextDouble();
        
        // Print the entered double value back to the console
        System.out.println("You entered: " + value);
        
        // Close the Scanner object
        scanner.close();
    }
}
