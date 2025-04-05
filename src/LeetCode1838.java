
import java.util.Arrays;

public class LeetCode1838 {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums); // Sort the array in ascending order
        int n = nums.length;
        int left = 0; // Left pointer of the sliding window
        long sum = 0; // Sum of elements within the window
        int maxFrequency = 0; // Maximum frequency found so far

        for (int right = 0; right < n; right++) { // Iterate through the array with the right pointer
            sum += nums[right]; // Add the current element to the sum

            // Check if the current window is valid (can be made all equal with k increments)
            while (sum + k < (long) (right - left + 1) * nums[right]) { // While the cost to make all elements in the window equal to nums[right] is greater than k
                sum -= nums[left]; // Remove the leftmost element from the sum
                left++; // Move the left pointer
            }

            // Update the maximum frequency
            maxFrequency = Math.max(maxFrequency, right - left + 1); // The current window size is a possible maximum frequency
        }

        return maxFrequency; // Return the maximum frequency found
    }

}
