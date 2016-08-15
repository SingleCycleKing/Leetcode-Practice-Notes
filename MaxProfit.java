/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 *
 * If you were only permitted to complete at most one transaction
 * (ie, buy one and sell one share of the stock),
 * design an algorithm to find the maximum profit.
 */
public class MaxProfit {
    public int maxProfit(int[] prices) {
        if (prices.length <= 0) return 0;
        int temp = prices[0];
        int MAX = 0;
        for (int price : prices) {
            if (price < temp) temp = price;
            else if (MAX < price - temp) MAX = price - temp;
        }
        return MAX;
    }
}
