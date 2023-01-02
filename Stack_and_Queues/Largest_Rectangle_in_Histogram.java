package Stack_and_Queues;

import java.util.Stack;

public class Largest_Rectangle_in_Histogram {

    class Solution {
        public static int largestRectangleArea(int[] heights) {
            int n = heights.length;
            Stack<Integer> st = new Stack<>();
            int[] leftSmall = new int[n];
            int[] rightSmall = new int[n];
            for (int i = 0; i < n; i++) {
                while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                    st.pop();
                }

                if (st.isEmpty()) leftSmall[i] = 0;
                else leftSmall[i] = st.peek() + 1;
                st.push(i);
            }

            // clear the stack to be re-used
            while (!st.isEmpty()) st.pop();

            for (int i = n - 1; i >= 0; i--) {
                while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                    st.pop();
                }

                if (st.isEmpty()) rightSmall[i] = n - 1;
                else rightSmall[i] = st.peek() - 1;

                st.push(i);
            }

            int maxA = 0;
            for (int i = 0; i < n; i++) {
                maxA = Math.max(maxA, heights[i] * (rightSmall[i] - leftSmall[i] + 1));
            }
            return maxA;
        }
    }
}

// Output -
/*
Input: heights = [2,1,5,6,2,3]
Output: 10
Explanation: The above is a histogram where width of each bar is 1.
The largest rectangle is shown in the red area, which has an area = 10 units.
 */

// Time & Space Complexity -
/*
Time - O(N)
Space - O(3N) where 3 is for the stack, left small array and a right small array
 */