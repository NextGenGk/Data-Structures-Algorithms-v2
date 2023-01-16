package Stack_and_Queues;

import java.util.Stack;

public class Stock_Span_Problem {

    // StockSpanner Class
    class StockSpanner {
        // Create stack
        Stack<int[]> stk;

        // Initialize
        public StockSpanner() {
            stk = new Stack<int[]>();
        }

        public int next(int price) {
            int span = 1;
            while (!stk.isEmpty() && stk.peek()[1] <= price) {
                span += stk.peek()[0];
                stk.pop();
            }
            stk.push(new int[]{span, price});
            return span;
        }
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */

// Output -
/*
Input
["StockSpanner", "next", "next", "next", "next", "next", "next", "next"]
[[], [100], [80], [60], [70], [60], [75], [85]]
Output
[null, 1, 1, 1, 2, 1, 4, 6]

Explanation
StockSpanner stockSpanner = new StockSpanner();
stockSpanner.next(100); // return 1
stockSpanner.next(80);  // return 1
stockSpanner.next(60);  // return 1
stockSpanner.next(70);  // return 2
stockSpanner.next(60);  // return 1
stockSpanner.next(75);  // return 4, because the last 4 prices (including today's price of 75) were less than or
equal to today's price.
stockSpanner.next(85);  // return 6
*/

// Algorithm -
/*
1. We maintain a stack of pairs of integers. The first integer in the pair is the span of the stock price,
 and the second integer is the price of the stock on that day.
2. We iterate through the prices from left to right.
3. If the stack is empty, we push a pair containing a span of 1 and the price of the stock on that day.
4. If the stack is not empty, we pop the top element from the stack.
5. If the top element’s price is less than or equal to the current price, we add the span of the top element to
 our current span.
6. If the top element’s price is greater than the current price, we push a new pair containing a span of 1 and the
 current price.
7. After iterating through the entire array of prices, the stack contains a list of spans. We return the top element
 of the stack, which is the maximum span.
*/

// Time & Space Complexity -
/*
Time - O(N), It seems more than O(N) at first look. If we take a closer look,
 we can observe that every element of the array is added and removed from the stack at most once.
Space - O(N), in the worst case when all elements are sorted in decreasing order.
*/