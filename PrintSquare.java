public class PrintSquare {
    // Main method, the entry point of the program
    public static void main(String[] args) {
        int number = 5; // Declare an integer variable named 'number' and assign it the value 5
        printSquare(number); // Call the printSquare method with 'number' as argument
    }

    // Method named printSquare that takes an integer parameter 'num' and prints its square
    public static void printSquare(int num) {
        int square = num * num; // Calculate the square of 'num'
        System.out.println("The square of " + num + " is: " + square); // Print the square to the console
    }
}
