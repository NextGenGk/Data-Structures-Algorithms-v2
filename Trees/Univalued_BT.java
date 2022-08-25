package Trees;

public class Univalued_BT {

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
        // Univalued Binary Tree Function
        public boolean isUnivalTree(TreeNode root) {
            // base case
            if (root == null) return true;
            if (root.left != null && root.left.val != root.val) return false;
            if (root.right != null && root.right.val != root.val) return false;
            return isUnivalTree(root.left) && isUnivalTree(root.right);
        }
    }
}

// Output -
/*
Input: root = [1,1,1,1,1,null,1]
Output: true
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(n), because of recursive stack
*/