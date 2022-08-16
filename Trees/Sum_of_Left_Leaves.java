package Trees;

import java.util.Stack;

public class Sum_of_Left_Leaves {

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
        /* Using Recursion */
        int leftLeafSum = 0;

        // Sum of Left Leaf Function
        public int sumOfLeftLeaves(TreeNode root) {
            // call helper function
            helper(root);
            return leftLeafSum;
        }

        // helper function to add all left leaf node
        public void helper(TreeNode root) {
            if (root == null) return;

            if (isLeafNode(root.left)) leftLeafSum += root.left.val;
            // recursive call for left and right
            helper(root.left);
            helper(root.right);
        }

        // find leaf node
        public boolean isLeafNode(TreeNode root) {
            if (root == null) return false;
            if (root.left == null && root.right == null) return true;
            else return false;
        }
    }
// Output-
/*
Input: root = [3,9,20,null,null,15,7]
Output: 24
Explanation: There are two left leaves in the binary tree, with values 9 and 15 respectively.

Input: root = [1]
Output: 0
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(n)
*/

    /* Using Iteration */
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        int ans = 0;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        while(!stack.empty()) {
            TreeNode node = stack.pop();
            if(node.left != null) {
                if (node.left.left == null && node.left.right == null)
                    ans += node.left.val;
                else
                    stack.push(node.left);
            }
            if(node.right != null) {
                if (node.right.left != null || node.right.right != null)
                    stack.push(node.right);
            }
        }
        return ans;
    }
}

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
*/