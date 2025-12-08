public class LeetCode121 {
    public static int maxProfit(int[] prices) {

        if (prices.length == 1) {
            return 0;
        }

        if (prices.length == 2) {
            return (prices[1] - prices[0]) > 0 ? prices[1] - prices[0] : 0;
        }

        int profit = 0;

        int buy = 0;
        int sell = 0;

        while (sell < prices.length && buy < prices.length) {

            if ((prices[sell] - prices[buy]) > profit) {
                profit = prices[sell] - prices[buy];
            }

            if (prices[sell] - prices[buy] == 0) {
                sell++;
            } else if (prices[sell] - prices[buy] < 0) {
                buy++;
            } else {
                sell++;
            }

        }
        return profit;
    }
}
