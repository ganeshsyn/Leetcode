class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0],profit=0;
        for(int i=1;i<prices.length;i++){
            int tempProfit=prices[i]-buy;
            profit=Math.max(profit,tempProfit);
            buy=Math.min(buy,prices[i]);
        }
        return profit;
    }
}