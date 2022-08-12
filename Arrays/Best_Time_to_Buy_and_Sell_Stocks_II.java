package Arrays;

public class Best_Time_to_Buy_and_Sell_Stocks_II {
    // Best Time to Buy & Sell Stocks II
    // (Max Profit Function)
    public int maxProfit(int[] prices) {
        // Initialize profit to 0
        int maxProfit = 0;

        // Looping through prices.length
        for (int i=1; i<prices.length; i++) {
            // Checking, if current elements is greater than previous elements,
            // then subtract current Element - previous Element
            // & then add on profit
            if (prices[i] > prices[i-1]) {
                maxProfit = maxProfit + (prices[i] - prices[i-1]);
            }
        }
        // Finally return maxProfit
        return maxProfit;
    }
}

// Output -
/*
Input: prices = [7,1,5,3,6,4]https://leetcode.com/subscribe?ref=nb_npl
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Total profit is 4 + 3 = 7.
*/

// Algorithm -
/*
1. Initialize profit to 0
2. Looping through prices.length
3. Checking, if current elements is greater than previous elements,
   then subtract current Element - previous Element
   & then add on profit
4. Finally return maxProfit
 */

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
 */