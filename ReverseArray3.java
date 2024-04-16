public class ReverseArray3{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        
        System.out.println("Original array:");
        printArray(array);
        
        reverseArray(array);
        
        System.out.println("Reversed array:");
        printArray(array);
    }
    
    // Method to reverse the elements of an array in-place
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // Move start index forward and end index backward
            start++;
            end--;
        }
    }
    
    // Method to print the elements of an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
