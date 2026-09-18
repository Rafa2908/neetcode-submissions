class Solution {
    public int maxProfit(int[] prices) {
        int starter = 0;
        int profit = 0;
        int best = prices[0];

        for(int i = 0; i < prices.length; i++){
            
            if(prices[i] == prices[starter]){
                continue;
            }

            if(prices[starter] > prices[i]){
                best = prices[i];
                starter = i;
            }

            int currentProfit = (prices[i] - best);

            if(prices[i] > best){
                if( currentProfit > profit){
                   profit = currentProfit;
                }  
            } else {
                continue;
            }
        }

        return profit;
    }
}
