import java.util.Arrays;

public class LeetCode2274 {

    public int maxConsecutive(int bottom, int top, int[] special) {

        Arrays.sort(special);
        int max = 0;
        max = Math.max(special[0] - bottom, max);
        max = Math.max(top - special[special.length - 1], max);
        for (int i = 1; i < special.length; i++) {
            max = Math.max(special[i] - special[i - 1]-1, max);
        }
        return max;
    }
}
