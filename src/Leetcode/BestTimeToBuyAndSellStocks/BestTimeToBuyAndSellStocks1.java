package Leetcode.BestTimeToBuyAndSellStocks;

public class BestTimeToBuyAndSellStocks1 {
    /**
     * Calculates the maximum profit that can be achieved from the given list of stock prices.
     *
     * @param prices an array of integers representing the stock prices on different days
     * @return the maximum profit that can be achieved
     */
    public int maxProfit(int[] prices) {
        int maxProfit = 0; // Variable to store the maximum profit found so far
        int minPrice = Integer.MAX_VALUE; // Variable to store the minimum price encountered so far

        // Iterate over each price in the prices array
        for (int price : prices) {
            // If the current price is less than the minimum price, update the minimum price
            if (price < minPrice) {
                minPrice = price;
            }
            // Otherwise, calculate the potential profit and update the maximum profit if needed
            else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        // Return the maximum profit found
        return maxProfit;
    }
}
