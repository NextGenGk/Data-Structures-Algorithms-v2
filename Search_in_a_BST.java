public class Search_in_a_BST {
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
        // Search BSTFunction
        public TreeNode searchBST(TreeNode root, int val) {
            // while root is not null
            // & root value is not equal to given value
            while (root != null && root.val != val) {
                // given value is less than root value
                // go to left side else go to right side
                root = val < root.val ? root.left : root.right;
            }
            // finally, return root
            return root;
        }
    }
}

// Output -
/*
Input: root = [4,2,7,1,3], val = 2
Output: [2,1,3]
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(h) height of binary tree
*/