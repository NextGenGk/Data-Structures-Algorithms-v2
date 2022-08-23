package Trees;

public class Convert_BST_to_Greater_Tree {

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
        // declare a variable sum & initialize with 0
        int sum = 0;

        // Convert BST Function
        public TreeNode convertBST(TreeNode root) {
            // if, root is not null
            if (root != null) {
                // recursive call for right subtree
                convertBST(root.right);
                // then last most element of right subtree root value is added to the sum
                sum += root.val;
                // then, place of root value the newly sum is added to the root value
                root.val = sum;
                // & then recursive call for left subtree
                convertBST(root.left);
            }
            // finally, return root of the tree
            return root;
        }
    }
}

// Output -
/*
Input: root = [4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]
Output: [30,36,21,36,35,26,15,null,null,null,33,null,null,null,8]
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(n), where n is the recursive calls in stack
*/