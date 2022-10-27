package Arrays;

public class Rotate_Image {

    class Solution {
        public void rotate(int[][] matrix) {
            // Transpose
            for (int i = 0; i < matrix.length; i++) {
                for (int j = i; j < matrix[0].length; j++) {
                    int temp = 0;
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }

            // Reversing Every Row
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length / 2; j++) {
                    int temp = 0;
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[i][matrix.length - 1 - j];
                    matrix[i][matrix.length - 1 - j] = temp;
                }
            }
        }
    }
}

// Output -
/*
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]
*/

// Algorithm -
/*
1. First, we transpose the matrix. This means that the matrix is first flipped along its diagonal.
2. Then, we reverse every row in the matrix.
*/

// Time & Space Complexity -
/*
Time - O(N^2), where N^2 for transposing a matrix & another N^2 for reversing the transposing matrix, means total is O(N^2)
Space - O(1), no extra space is needed
*/