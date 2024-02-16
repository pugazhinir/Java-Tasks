public class MathOperation{

    // Global array to store calculated results
    static double[] results = new double[4];

    public static void main(String[] args) {
        // Example: Hardcoded two numbers
        double num1 = 10.5;
        double num2 = 5.0;

        // Perform math operations
        add(num1, num2);
        subtract(num1, num2);
        multiply(num1, num2);
        divide(num1, num2);

        // Print the results
        System.out.println("Results:");
        System.out.println("Addition: " + results[0]);
        System.out.println("Subtraction: " + results[1]);
        System.out.println("Multiplication: " + results[2]);
        System.out.println("Division: " + results[3]);
    }

    // Method to add two numbers and store the result in the array
    public static void add(double num1, double num2) {
        results[0] = num1 + num2;
    }

    // Method to subtract the second number from the first and store the result
    public static void subtract(double num1, double num2) {
        results[1] = num1 - num2;
    }

    // Method to multiply two numbers and store the result in the array
    public static void multiply(double num1, double num2) {
        results[2] = num1 * num2;
    }

    // Method to divide the first number by the second and store the result
    public static void divide(double num1, double num2) {
        // Checking if the second number is not zero to avoid division by zero
        if (num2 != 0) {
            results[3] = num1 / num2;
        } else {
            System.out.println("Cannot divide by zero.");
            results[3] = Double.NaN; // Set result to NaN (Not a Number) in case of division by zero
        }
    }
}
