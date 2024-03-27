import java.util.Random;

public class KthLargestElement {

    public static int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 1 || k > nums.length)
            throw new IllegalArgumentException("Invalid input or k out of bounds");

        return quickSelect(nums, 0, nums.length - 1, nums.length - k);
    }

    private static int quickSelect(int[] nums, int left, int right, int k) {
        if (left == right)
            return nums[left];

        int pivotIndex = partition(nums, left, right);

        if (k == pivotIndex)
            return nums[k];
        else if (k < pivotIndex)
            return quickSelect(nums, left, pivotIndex - 1, k);
        else
            return quickSelect(nums, pivotIndex + 1, right, k);
    }

    private static int partition(int[] nums, int left, int right) {
        int pivotIndex = left + new Random().nextInt(right - left + 1);
        int pivotValue = nums[pivotIndex];
        swap(nums, pivotIndex, right);

        int i = left;
        for (int j = left; j < right; j++) {
            if (nums[j] <= pivotValue) {
                swap(nums, i, j);
                i++;
            }
        }
        swap(nums, i, right);
        return i;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4}; // Example array
        int k = 2; // Find the 2nd largest element

        int result = findKthLargest(nums, k);
        System.out.println("The " + k + "th largest element is: " + result);
    }
}