public class Findmin {
    public static void main(String[] args) {
        // Declare and initialize the array
        int[] numbers = {1, 2, 3, 4, 5};

        // Find the minimum element
        int min = numbers[0]; // Initialize min to the first element
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // Print the minimum element
        System.out.println("The minimum element in the numbers array is: " + min);
    }
}
