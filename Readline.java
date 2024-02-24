import java.util.Scanner;

public class Readline {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        
        // Read the input sentence
        String sentence = scanner.nextLine();
        
        // Convert the sentence to uppercase
        String uppercaseSentence = sentence.toUpperCase();
        
        // Print the sentence in uppercase
        System.out.println("Uppercase sentence: " + uppercaseSentence);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
