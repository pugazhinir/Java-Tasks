public class NumberPyramid {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pyramid
        
        // Outer loop to iterate through rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop to print spaces before numbers
            for (int j = rows - i; j > 0; j--) {
                System.out.print("  "); // Print two spaces
            }
            
            // Inner loop to print numbers in ascending order
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            
            // Inner loop to print numbers in descending order
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            
            System.out.println(); // Move to the next line for the next row
        }
    }
}
