public class Reversearray {
    public static void main(String[] args) {
        // Declare and initialize the original array
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Reverse the elements in-place
        int left = 0;
        int right = numbers.length - 1;
        
        while (left < right) {
            // Swap elements at left and right pointers
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            
            // Move the pointers towards the center
            left++;
            right--;
        }
        
        // Print the reversed array (for verification)
        System.out.println("The elements of the reversed numbers array are:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
