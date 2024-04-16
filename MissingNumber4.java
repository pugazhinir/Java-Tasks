public class MissingNumber {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 3, 7, 8}; // Example array with one missing number
        
        int n = array.length + 1; // Since one number is missing, the length of the array is n-1
        
        int missingNumber = findMissingNumber(array, n);
        
        System.out.println("The missing number is: " + missingNumber);
    }
    
    // Method to find the missing number in an array of integers from 1 to n
    public static int findMissingNumber(int[] arr, int n) {
        // Calculate the sum of integers from 1 to n
        int sum = n * (n + 1) / 2;
        
        // Calculate the sum of elements in the array
        int arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }
        
        // The missing number is the difference between the expected sum and the actual sum
        return sum - arraySum;
    }
}
