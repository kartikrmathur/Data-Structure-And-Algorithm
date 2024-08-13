package Leetcode.BestTimeToBuyAndSellStocks;

public class BestTimeTOBuyAndSellStocks {
    public int maxProfit(int[] prices) {
        int i;
        int min_price = prices[0];
        int max_prof = 0;

        for (i = 1; i < prices.length; i++) {
            max_prof = Math.max(max_prof,prices[i]-min_price);
            min_price = Math.min(prices[i],min_price);
        }

        return max_prof;
    }
}
