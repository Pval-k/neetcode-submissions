class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int i = 0;
        int j = 1;

        //i: buy: low price
        //j: sell: high price
        while(j<prices.length){
            if(prices[i]<prices[j]){
                int price = prices[j]-prices[i];
                max_profit = Math.max(max_profit, price);
            }
            else{
                i = j;
            }
            j++;
        }
        return max_profit;
    }
}
