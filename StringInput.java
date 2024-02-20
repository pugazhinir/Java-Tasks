import java.util.Scanner;

public class StringInput{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter a string (type 'exit' to quit): ");
            String input = scanner.nextLine();
            
            if (input.toLowerCase().contains("exit")) {
                System.out.println("Exiting the program...");
                break;
            }
            
            System.out.println("You entered: " + input);
        }
        
        scanner.close();
    }
}
