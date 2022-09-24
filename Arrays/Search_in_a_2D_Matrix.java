package Arrays;

public class Search_in_a_2D_Matrix {

    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int n = matrix.length;
            int m = matrix[0].length;

            int low = 0;
            int high = (n * m) - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (matrix[mid / m][mid % m] == target) {
                    return true;
                }

                if (matrix[mid / m][mid % m] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return false;
        }
    }
}

// Output -
/*
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
*/

// Algorithm -
/*
1. We first check if the matrix is empty. If it is, then we return false.
2. We then calculate the number of rows and columns in the matrix.
3. We then set low to 0 and high to (n * m) - 1.
4. We then loop while low is less than or equal to high.
5. We then calculate the mid value.
6. If matrix[mid/m][mid%m] is equal to target, then we return true.
7. If matrix[mid/m][mid%m] is less than target, then we set low to mid + 1.
8. If matrix[mid/m][mid%m] is greater than target, then we set high to mid - 1.
9. Finally, we return false.
*/

// Time & Space Complexity -
/*
Time - O(log(m*n))
Space - O(1)
*/