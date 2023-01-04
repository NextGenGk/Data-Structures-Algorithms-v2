package Stack_and_Queues;

public class Maximum_Rectangle {

    class Solution {
        public int maximalRectangle(char[][] matrix) {
            if (matrix.length == 0) return 0;
            // for each cell with value=1,
            // we look upward (north), the number of continuous '1' is the height of cell
            int[] heights = new int[matrix[0].length];
            int maxArea = -1;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] == '0') {
                        heights[j] = 0;
                    } else {
                        heights[j]++;
                    }
                }
                int area = largestRectangleArea(heights);
                maxArea = Math.max(maxArea, area);
            }
            return maxArea;
        }

        // Largest Rectangle in Histogram
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

// Output -
/*
Input: matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
Output: 6
Explanation: The maximal rectangle is shown in the above picture.
*/

// Algorithm -
/*
1. We first initialize the heights array with all zeros.
2. We then iterate through the matrix and for each cell with value=1, we look upward (north), the number of continuous '1' is the height of cell.
3. We then calculate the area of the rectangle with the largest area.
*/

// Time & Space Complexity -
/*
Time - O(R x C), Only one traversal of the matrix is required, so the time complexity is O(R X C)
Space - O(C), Stack is required to store the columns, so space complexity is O(C)
*/
}
