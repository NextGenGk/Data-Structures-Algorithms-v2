package Trees;

public class Range_Sum_in_BST {

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
        // Range Sum BST Function
        public int rangeSumBST(TreeNode root, int low, int high) {
            // base case
            if (root == null) return 0;
            // if root value is greater than high, then recursive call for left subtree
            if (root.val > high) return rangeSumBST(root.left, low, high);
            // if root value is less than low, then recursive call for right subtree
            if (root.val < low) return rangeSumBST(root.right, low, high);
            // if left < node < right is this case was satisfied then
            return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
        }
    }
}

// Output -
/*
Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
Output: 32
Explanation: Nodes 7, 10, and 15 are in the range [7, 15]. 7 + 10 + 15 = 32.
*/

// Time & Space Complexity -
/*
Time - O(n), where n is the numbers of node in Bst
Space - O(h), where h is the height of the tree
*/