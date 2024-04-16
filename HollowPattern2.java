public class HollowPattern2{
    public static void main(String[] args) {
        int size = 5; // Size of the pattern (number of lines)

        for (int i = size; i >= 1; i--) {
            // Print spaces before the asterisks
            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
