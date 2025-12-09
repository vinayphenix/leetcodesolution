import java.util.*;

public class MaxOfMinInSubarrays {
    public static int maxOfMinSubarrays(int[] arr, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        int n = arr.length;
        int maxMin = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            // Remove indices out of the current window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // Maintain increasing order in deque
            while (!deque.isEmpty() && arr[deque.peekLast()] >= arr[i]) {
                deque.pollLast();
            }

            deque.offerLast(i);

            // Record minimum once the first window is complete
            if (i >= k - 1) {
                maxMin = Math.max(maxMin, arr[deque.peekFirst()]);
            }
        }

        return maxMin;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4};
        int k = 3;
        System.out.println("Output: " + maxOfMinSubarrays(arr, k)); // Output: 4
    }
}