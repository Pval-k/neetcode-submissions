class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int i = 0;
        int j = 0;

        //i = low
        //j = high

        //increase the window: incrementally  
        //decrease the window: when i > j

        while(j < prices.length){
            int profit = prices[j]-prices[i];
            maxProfit = Math.max(maxProfit, profit);
            while(prices[i] > prices[j]){
                i++;
            }
            j++;
        }

        return maxProfit;
    }
}
