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

x = dp[0] * dp[2]
y = dp[1] * dp[1]
z = dp[2] * dp[1]
*/

// Example -
/*
For example: N = 5

Initially set cat_=1 then, print cat_  ,

then, iterate from i = 1 to i < 5

for i = 1; cat_ = cat_ * (4*1-2)=1*2=2
cat_ = cat_ / (i+1)=2/2 = 1

For i = 2; cat_ = cat_ * (4*2-2)=1*6=6
cat_ = cat_ / (i+1)=6/3=2

For i = 3 :-      cat_ = cat_ * (4*3-2)=2*10=20
cat_ = cat_ / (i+1)=20/4=5

For i = 4 :-      cat_ = cat_ * (4*4-2)=5*14=70
 cat_ = cat_ / (i+1)=70/5=14
 */

// Time & Space Complexity -
/*
Time - O(n2)
Space - O(n) ,because we create an array of size n + 1
*/