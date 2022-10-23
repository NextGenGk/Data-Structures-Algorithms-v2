package Arrays;

public class Print_Spiral_Matrix {

    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> list = new ArrayList<>();

            int row = matrix.length;
            if (row == 0) return list;
            int col = matrix[0].length;

            int left = 0;
            int right = col - 1;
            int top = 0;
            int bottom = row - 1;
            int d = 0;

            while (left <= right && top <= bottom) {
                if (d == 0) {
                    for (int i = left; i <= right; i++) {
                        list.add(matrix[top][i]);
                    }
                    top++;
                    d = 1;
                } else if (d == 1) {
                    for (int i = top; i <= bottom; i++) {
                        list.add(matrix[i][right]);
                    }
                    right--;
                    d = 2;
                } else if (d == 2) {
                    for (int i = right; i >= left; i--) {
                        list.add(matrix[bottom][i]);
                    }
                    bottom--;
                    d = 3;
                } else if (d == 3) {
                    for (int i = bottom; i >= top; i--) {
                        list.add(matrix[i][left]);
                    }
                    left++;
                    d = 0;
                }
            }
            return list;
        }
    }
}

// Output -
/*
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
*/

// Algorithm -
/*
1. First, we initialize the list and the four boundaries.
2. Then, we check if the left boundary is less than or equal to the right boundary, and the top boundary is less than or equal to the bottom boundary.
3. If the above condition is true, we check the direction.
4. If the direction is 0, we traverse the matrix row by row from left to right.
5. If the direction is 1, we traverse the matrix column by column from top to bottom.
6. If the direction is 2, we traverse the matrix row by row from right to left.
7. If the direction is 3, we traverse the matrix column by column from bottom to top.
8. After the traversal, we return the list.
*/

// Time & Space Complexity -
/*
Time - O(R x C), where R stands for row & C stands for column
Space - O(1), no extra space is needed
*/