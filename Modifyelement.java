public class Modifyelement {
    public static void main(String[] args) {
        // Declare and initialize the array
        int[] numbers = {1, 2, 3, 4, 5};

        // Change the value of the second element (index 1) to 10
        numbers[1] = 10;

        // Print the updated array
        System.out.println("The elements of the numbers array after modification are:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
