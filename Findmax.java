public class Findmax {
    public static void main(String[] args) {
        // Declare and initialize the array
        int[] numbers = {1, 2, 3, 4, 5};

        // Find the maximum element
        int max = numbers[0]; // Initialize max to the first element
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Print the maximum element
        System.out.println("The maximum element in the numbers array is: " + max);
    }
}
