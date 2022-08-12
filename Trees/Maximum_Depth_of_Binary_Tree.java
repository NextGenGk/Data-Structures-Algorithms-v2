package Trees;

public class Maximum_Depth_of_Binary_Tree {

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
        // Maximum Depth Function
        public int maxDepth(TreeNode root) {
            // if, root is null, return 0
            if (root == null) return 0;

            // recursive call for left subtree
            int leftHeight = maxDepth(root.left);
            // recursive call for right subtree
            int rightHeight = maxDepth(root.right);

            // return, Max of left & right
            // & add 1 to it
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}

// Output -
/*
Input: root = [3,9,20,null,null,15,7]
Output: 3
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(h), where, h is the height of tree
*/