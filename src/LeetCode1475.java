import java.util.LinkedList;

public class LeetCode1475 {
    public int[] finalPrices(int[] prices) {

        // int[] ans = new int[prices.length];
        LinkedList<Integer> stack = new LinkedList<>();
        for (int i = 0; i < prices.length; i++) {

            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                int index = stack.pop();
                prices[index] = prices[index] - prices[i];
            }

            stack.push(i);
        }
        return prices;
    }
}
