public class Fibonacci {
    public static void main(String[] args) {
        // Check if the correct number of command-line arguments is provided
        if (args.length != 1) {
            System.out.println("Usage: java Fibonacci <num>");
            System.exit(1);
        }

        try {
            // Parse the command-line argument as an integer
            int num = Integer.parseInt(args[0]);

            // Print the Fibonacci series up to the specified number
            System.out.println("Fibonacci series up to " + num + ":");
            printFibonacci(num);

        } catch (NumberFormatException e) {
            System.out.println("Please provide a valid integer as a command-line argument.");
        }
    }

    // Function to calculate and print Fibonacci series
    private static void printFibonacci(int num) {
        int a = 0, b = 1;

        for (int i = 0; i < num; i++) {
            System.out.print(a + " ");

            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
