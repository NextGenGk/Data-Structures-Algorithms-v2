public class Root_Equal_Sum_of_Children {

    // Definition for a binary tree node.
      public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
        }
      }

    class Solution {
        // Check Tree Function
        public boolean checkTree(TreeNode root) {
            // if, root value is equal to root left value + root right value
            // then, return true
            if (root.val == (root.left.val) + (root.right.val)) {
                return true;
            }
            // else, return false
            else {
                return false;
            }
        }
    }
}

// Output -
/*
Input: root = [10,4,6]
Output: true
Explanation: The values of the root, its left child, and its right child are 10, 4, and 6, respectively.
10 is equal to 4 + 6, so we return true.
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
*/