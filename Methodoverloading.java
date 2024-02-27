public class Methodoverloading {
    // Main method, the entry point of the program
    public static void main(String[] args) {
        int intResult = add(5, 7); // Call add method with integers and store the result
        double doubleResult = add(3.5, 2.5); // Call add method with doubles and store the result
        int intDoubleResult = add(5, 3.5); // Call add method with an integer and a double and store the result
        
        // Print results
        System.out.println("Result of adding integers: " + intResult);
        System.out.println("Result of adding doubles: " + doubleResult);
        System.out.println("Result of adding an integer and a double: " + intDoubleResult);
    }

    // Method overloading: Add method with integer parameters
    public static int add(int a, int b) {
        return a + b;
    }

    // Method overloading: Add method with double parameters
    public static double add(double a, double b) {
        return a + b;
    }

    // Method overloading: Add method with an integer and a double parameter
    public static double add(int a, double b) {
        return a + b;
    }
}
