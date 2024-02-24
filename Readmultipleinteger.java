import java.util.Scanner;

public class Readmultipleintegers {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter three integers separated by spaces
        System.out.print("Please enter three integers separated by spaces: ");
        
        // Read the integers entered by the user
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        // Calculate the sum of the three integers
        int sum = num1 + num2 + num3;
        
        // Print the sum of the three integers
        System.out.println("The sum of the three integers is: " + sum);
        
        // Close the Scanner object
        scanner.close();
    }
}
