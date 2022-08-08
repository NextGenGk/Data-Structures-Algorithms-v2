public class Unique_Binary_Search_Tree {
    // Number of structurally unique BST Function
    public int numTrees(int n) {
        // create an array
        int dp[] = new int[n+1];
        // initialize value
        dp[0] = 1;
        dp[1] = 1;
        // looping through last element
        for(int i=2; i<=n; i++) {
            // looping through ith element
            for(int j=0; j<i; j++) {
                // & then calculate the answer
                dp[i] += dp[j] * dp[i - 1 - j];
            }
        }
        // finally, return array
        return dp[n];
    }
}

// Output -
/*
Input: n = 3
Output: 5

Catalan Number - The first few Catalan numbers for
n = 0, 1, 2, 3, … are 1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862, …
*/

// Idea -
/*
Formula of Catalan Number- (C)n = (C)i (C)n-i-1
*/

// Time & Space Complexity -
/*
Time - O(n2)
Space - O(n) ,because we create an array of size n + 1
*/