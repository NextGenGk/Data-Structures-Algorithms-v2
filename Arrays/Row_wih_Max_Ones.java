package Arrays;

public class Row_wih_Max_Ones {

    class Solution {
        int rowWithMax1s(int[][] arr, int n, int m) {
            // initialize the column and row to the last column and -1 respectively
            int col = m - 1;
            int row = -1;

            // Traversing row by row
            for (int i = 0; i < n; i++) {

                // last column to first
                for (int j = col; j >= 0; j--) {
                    // if, any column value is equal to 1
                    // than row updates to row index
                    // & decrease the column by one
                    if (arr[i][j] == 1) {
                        row = i;
                        col--;
                    }
                    // if, you see zero (0) then skip that row
                    else {
                        break;
                    }
                }
            }
            // finally, return row
            return row;
        }
    }
}

// Output -
/*
Input:
N = 4 , M = 4
Arr[][] = {{0, 1, 1, 1},
           {0, 0, 1, 1},
           {1, 1, 1, 1},
           {0, 0, 0, 0}}
Output: 2
Explanation: Row 2 contains 4 1's (0-based indexing).
*/

// Algorithm -
/*
1. We initialize the column and row to the last column and -1 respectively.
2. We traverse the rows one by one.
3. We traverse the columns from the last column to the first column.
4. If we see any column value as 1, we update the row to the row index and decrease the column by one.
5. If we see any zero (0) in the column, we skip that row.
6. Finally, we return the row.
*/

// Time & Space Complexity -
/*
Time - O(log(m+n)), where m is my column & n is my row
Space - O(1), no extra space is needed
*/