import java.util.Scanner;

public class Readarray {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter five integers separated by spaces
        System.out.print("Enter five integers separated by spaces: ");
        
        // Read the input line
        String input = scanner.nextLine();
        
        // Split the input line into individual integers
        String[] numbers = input.split(" ");
        
        // Create an array to store the integers
        int[] array = new int[numbers.length];
        
        // Convert the string numbers to integers and store them in the array
        for (int i = 0; i < numbers.length; i++) {
            array[i] = Integer.parseInt(numbers[i]);
        }
        
        // Print the array in reverse order
        System.out.print("Array in reverse order: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
