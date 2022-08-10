public class Balanced_Binary_Tree {

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
        // Height Function
        int dfsHeight(TreeNode root) {
            // if root is null, return 0
            if (root == null) return 0;

            // recursive call for left subtree
            int leftHeight = dfsHeight(root.left);
            // recursive call for right subtree
            int rightHeight = dfsHeight(root.right);
            // if, left side gives me -1 OR
            // right side gives me -1, then return -1
            if (leftHeight == -1 || rightHeight == -1) return -1;

            // if, right - left is greater than 1, return -1
            if (Math.abs(rightHeight - leftHeight) > 1) return -1;

            // return, Max of left & right
            // & add 1 to it
            return Math.max(leftHeight, rightHeight) + 1;
        }

        // Is Balanced Binary Tree Function
        public boolean isBalanced(TreeNode root) {
            // if dfsHeight give me 0, then, return true
            return dfsHeight(root) != -1;
        }
    }
}

// Output -
/*
Input: root = [3,9,20,null,null,15,7]
Output: true
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(n) ,auxiliary stack space for skew tree
*/