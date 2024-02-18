public class FactorialCalculator {
    public static void main(String[] args) {
        // Define the number for which factorial needs to be calculated
        int number = 5; // You can change this to any non-negative integer

        // Calculate the factorial
        long factorial = calculateFactorial(number);

        // Display the result
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    // Function to calculate factorial
    static long calculateFactorial(int n) {
        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
            return -1; // Return -1 to indicate an error
        }

        // Base case: factorial of 0 is 1
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive case: n! = n * (n-1)!
        return n * calculateFactorial(n - 1);
    }
}

