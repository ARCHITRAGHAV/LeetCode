class Solution {
    public int maxProfit(int[] prices) {
    int maxProfit = 0;
        int buyingprice[] = new int[prices.length];
        int bp = Integer.MAX_VALUE;
        buyingprice[0] = prices[0];
        for (int i = 1; i < buyingprice.length; i++) {
            if (bp > prices[i - 1]) {
                bp = prices[i - 1];
            }
            buyingprice[i] = bp;
        }
        for (int i = 0; i < prices.length; i++) {
            int profit = prices[i] - buyingprice[i];
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}