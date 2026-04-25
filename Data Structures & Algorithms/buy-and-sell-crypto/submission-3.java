class Solution {
    public int maxProfit(int[] prices) {
        int i = 0; //want i to be low
        int j = 1; //want j to be high
        int max_profit = 0;

        while(j<prices.length){
            while(prices[j]<prices[i]){
                i++;
            }
            int profit = prices[j]-prices[i];
            max_profit = Math.max(profit, max_profit);
            j++;
        }
        return max_profit;
    }
}
