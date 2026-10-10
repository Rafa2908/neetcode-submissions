class Solution {
    public int maxProfit(int[] prices) {
        int best = prices[0];
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < best) {
                best = prices[i];
            }

            if (prices[i] > best) {
                int currentProfit = prices[i] - best;
                if (currentProfit > profit)
                    profit = currentProfit;
            }
        }

        return profit;
    }
}
