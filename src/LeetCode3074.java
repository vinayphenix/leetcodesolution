import java.util.Arrays;

public class LeetCode3074 {

    public int minimumBoxes(int[] apple, int[] capacity) {

        int sum = 0;
        int count = 0;
        for (int a : apple) {
            sum += a;
        }

        Arrays.sort(capacity);

        for (int c = capacity.length - 1; c >= 0; c--) {
            count++;
            sum = sum - capacity[c];
            if (sum <= 0) {
                break;
            }
        }
        return count;
    }
}
