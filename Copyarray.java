public class Copyarray {
    public static void main(String[] args) {
        // Declare and initialize the original array
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Create a new array to store the copy
        int[] copyNumbers = new int[numbers.length];
        
        // Copy elements from numbers to copyNumbers
        for (int i = 0; i < numbers.length; i++) {
            copyNumbers[i] = numbers[i];
        }
        
        // Print the elements of copyNumbers (just for verification)
        System.out.println("The elements of copyNumbers array are:");
        for (int i = 0; i < copyNumbers.length; i++) {
            System.out.println(copyNumbers[i]);
        }
    }
}
