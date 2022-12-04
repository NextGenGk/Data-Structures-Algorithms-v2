package Strings;

public class Word_Search {

    class Solution {
        // Exist Function
        public boolean exist(char[][] board, String word) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (board[i][j] == word.charAt(0) && dfs(board, i, j, 0, word)) {
                        return true;
                    }
                }
            }
            return false;
        }

        // Boolean DFS Function
        private boolean dfs(char[][] board, int i, int j, int count, String word) {
            if (count == word.length()) {
                return true;
            }
            // Boundary check
            if (i == -1 || i == board.length || j == -1 || j == board[0].length || board[i][j] != word.charAt(count)) {
                return false;
            }
            char temp = board[i][j];
            board[i][j] = '*';
            boolean found = dfs(board, i + 1, j, count + 1, word) ||
                    dfs(board, i - 1, j, count + 1, word) ||
                    dfs(board, i, j + 1, count + 1, word) ||
                    dfs(board, i, j - 1, count + 1, word);
            board[i][j] = temp;
            return found;
        }
    }
}

// Output -
/*
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
Output: true
*/

// Algorithm -
/*
1. We start with the first character of the word.
2. We check if the first character of the word exists in the board.
3. If it does, we call the dfs function with the starting position of the character.
4. The dfs function checks if the current character is equal to the character we’re looking for.
5. If it is, we check if we’ve reached the end of the word.
6. If we have, we return true.
7. If we haven’t, we go to step 4.
8. If the current character doesn’t match the character we’re looking for, we return false.
9. If we’ve exhausted all the possible moves and haven’t found the word, we return false.
*/

// Time & Space Complexity -
/*
Time - O(N*M), where N is row size and M is the column size.
Space - O(1), no extra space is needed
*/