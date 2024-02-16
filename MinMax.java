public class MinMax {
    public static void main(String[] args) {
        // Check if command line arguments are provided
        if (args.length == 0) {
            System.out.println("Please provide at least one number as a command line argument.");
            return;
        }

        // Parse the first argument as an integer to initialize min and max
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[0]);

        // Iterate through the remaining arguments to find min and max
        for (int i = 1; i < args.length; i++) {
            int currentNumber = Integer.parseInt(args[i]);

            // Update min if the current number is smaller
            if (currentNumber < min) {
                min = currentNumber;
            }

            // Update max if the current number is larger
            if (currentNumber > max) {
                max = currentNumber;
            }
        }

        // Print the results
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
