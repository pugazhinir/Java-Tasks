public class HollowAlphabet {
    public static void main(String[] args) {
        int size = 5; // Size of the pattern (number of lines)

        for (int i = 0; i < size; i++) {
            // Print spaces before the character
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }

            // Print the left character
            System.out.print((char) ('A' + i));

            // Print spaces between characters
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(" ");
            }

            // Print the right character
            if (i != 0) {
                System.out.print((char) ('A' + i));
            }

            // Move to the next line
            System.out.println();
        }
    }
}
