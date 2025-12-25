import java.util.Arrays;

public class LeetCode3075 {

    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long sum = 0;
        int n = happiness.length;
        for (int i = n - 1; i >= 0; i--) {
            if (k == 0) {
                break;
            }
            int c = happiness[i] - ((n - 1) - i);
            if (c <= 0) {
                sum = sum + 0;
            } else {
                sum = sum + c;
            }
            k--;

        }
        return sum;
    }
}
