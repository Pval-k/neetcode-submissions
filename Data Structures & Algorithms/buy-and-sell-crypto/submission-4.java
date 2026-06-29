class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;

        //buy at a small price i
        //sell at a higher price j
        for(int i = 0; i < prices.length; i++){
            int j = i+1;
            while(j < prices.length){
                int cur_price = prices[j]-prices[i];
                max_profit = Math.max(max_profit, cur_price);
                j++;
            }
        }

        return max_profit;
    }
}
