public class Averageofelement {
    public static void main(String[] args) {
        // Declare and initialize the array
        int[] numbers = {1, 2, 3, 4, 5};

        // Calculate the sum of all elements
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Calculate the average
        double average = (double) sum / numbers.length;

        // Print the average
        System.out.println("The average of all elements in the numbers array is: " + average);
    }
}
