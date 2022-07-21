public class Best_Time_to_Buy_and_Sell_Stocks_I {
    // MaxProfit Function
    public int maxProfit(int[] prices) {
        // Initialize minSoFar to 1st element of prices
        int minSoFar = prices[0];
        // Initialize maxProfit to 0
        int maxProfit = 0;

        // Looping through prices.length
        for (int i=1; i<prices.length; i++) {
            // Find minimum prices to buy a stock
            minSoFar = Math.min(minSoFar, prices[i]);

            // Find profit
            int profit = prices[i] - minSoFar;

            // Maximum profit
            maxProfit = Math.max(maxProfit, profit);
        }
        // Finally return maxProfit
        return maxProfit;
    }
}

// Output -
/*
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
*/

// Algorithm -
/*
1. Declare variable minSoFar & maxProfit
2. Looping through prices.length
3. Find minimum price to buy this stock
4. Find profit from minimum & prices[i]
5. Find maximum profit
6. Finally return maxProfit
 */

// Time & Space Complexity
/*
Time - O(n)
Space - O(1)
 */
