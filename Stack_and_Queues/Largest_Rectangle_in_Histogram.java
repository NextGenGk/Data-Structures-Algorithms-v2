package Stack_and_Queues;

import java.util.Stack;

public class Largest_Rectangle_in_Histogram {

    class Solution {
        public static int largestRectangleArea(int[] heights) {
            int n = heights.length;
            Stack<Integer> st = new Stack<>();
            int[] leftSmall = new int[n];
            int[] rightSmall = new int[n];
            // Previous Smaller Element
            for (int i = 0; i < n; i++) {
                while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                    st.pop();

                }
                if (st.isEmpty()) {
                    leftSmall[i] = 0;
                } else {
                    leftSmall[i] = st.peek() + 1;
                }
                st.push(i);
            }

            // clear the stack to be re-used
            while (!st.isEmpty()) st.pop();

            // Next Smaller Element
            for (int i = n - 1; i >= 0; i--) {
                while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                    st.pop();
                }

                if (st.isEmpty()) {
                    rightSmall[i] = n - 1;
                } else {
                    rightSmall[i] = st.peek() - 1;
                }
                st.push(i);
            }

            int totalUnits = 0;
            for (int i = 0; i < n; i++) {
                totalUnits = Math.max(totalUnits, (rightSmall[i] - leftSmall[i] + 1) * heights[i]);
            }
            return totalUnits;
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

// Approach / Intuition -
/*
Intuition: The intuition behind the approach is the same as finding the smaller element on both sides but in an optimized way using the concept of the next greater element and the next smaller element.
*/

// Algorithm -
/*
1. We first initialize a stack.
2. We then iterate through the array and for each element, we keep popping elements from the stack while the
 stack is not empty and the top of the stack is greater than or equal to the current element.
3. If the stack becomes empty, then the current element is the left-most element.
4. If the stack does not become empty, then the current element is the right-most element.
5. We then push the current element to the stack.
6. We then repeat steps 2-5 for all the elements in the array.
7. Finally, we calculate the maximum area by iterating through the array and calculating the area for each element.
 */

// Time & Space Complexity -
/*
Time - O(N)
Space - O(3N) where 3 is for the stack, left small array and a right small array
 */