import java.util.Scanner;

public class Readmultidouble {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter three double values separated by commas
        System.out.print("Enter three double values separated by commas: ");
        String input = scanner.nextLine();
        
        // Split the input string into individual values
        String[] valuesArray = input.split(",");
        
        // Convert the values to doubles and calculate the average
        double total = 0;
        for (String value : valuesArray) {
            total += Double.parseDouble(value.trim());
        }
        double average = total / valuesArray.length;
        
        // Print the average
        System.out.println("The average of the entered values is: " + average);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
