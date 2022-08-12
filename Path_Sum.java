public class Path_Sum {

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
        // Has Path Sum Function
        public boolean hasPathSum(TreeNode root, int targetSum) {
            // if, root has no value return false
            if (root == null) return false;

            // root left is equal to null & root right is null
            // & root value is equal to targetSum, return true
            if (root.left == null && root.right == null
                    && root.val == targetSum) return true;

            // targetSum = targetSum - root value
            targetSum = targetSum - root.val;

            // recursive call for left & right subtree
            // if one is true, return true
            return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
        }
    }
}

// Output -
/*
Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
Output: true
Explanation: The root-to-leaf path with the target sum is shown.
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
*/