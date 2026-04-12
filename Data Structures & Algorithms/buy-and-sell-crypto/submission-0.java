class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int j = 1;
        int max_profit = 0;

        while(j<prices.length){
            if(prices[j] > prices[i]){
                int cur_profit = prices[j]-prices[i];
                max_profit = Math.max(max_profit, cur_profit);
            }
            else{
                i = j;
            }
            j++;
        }
        return max_profit;

        
    }
}
