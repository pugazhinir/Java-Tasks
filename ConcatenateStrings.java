public class ConcatenateStrings {

    public static void main(String[] args) {
        // Check if the correct number of command-line arguments is provided
        if (args.length != 2) {
            System.out.println("Usage: java ConcatenateStrings <string1> <string2>");
            System.exit(1);
        }

        // Extract command-line arguments
        String inputString1 = args[0];
        String inputString2 = args[1];

        // Concatenate strings
        String result = concatenateStrings(inputString1, inputString2);

        // Print the result
        System.out.println("Concatenated String: " + result);
    }

    private static String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }
}
