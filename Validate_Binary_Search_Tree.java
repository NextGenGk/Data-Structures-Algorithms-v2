public class Validate_Binary_Search_Tree {
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
        // Create a variable prev
        // & initialize with null
        TreeNode prev = null;

        // IsValidBST Function
        public boolean isValidBST(TreeNode root) {
            // if root is not null
            if (root != null) {
                // if, isValidBST is not create a subtree in left side
                // then, return false
                if (!isValidBST(root.left)) return false;

                // if, prev is not null & root value is less than previous value
                // then, return false
                if (prev != null && root.val <= prev.val) return false;

                // in, each iteration root value is add on prev
                prev = root;

                // recursive call for right subtree
                return isValidBST(root.right);
            }
            return true;
        }
    }
}

// Output -
/*
Input: root = [2,1,3]
Output: true
*/

// Time & Space Complexity -
/*
Time - O(n), As we visit every node just once
Space - O(h) , where h is the height of the tree
*/