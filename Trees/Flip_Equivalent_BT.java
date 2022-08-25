package Trees;

public class Flip_Equivalent_BT {

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
        // FlipEquiv Function
        public boolean flipEquiv(TreeNode root1, TreeNode root2) {
            // if, both the trees are same than, return true
            if (root1 == root2) return true;
            // if, root1 or root2 is null
            // or root1 value is not equal to root2 value than, return false
            if (root1 == null || root2 == null || root1.val != root2.val) return false;

            // return, (root1 left is equal to root2 left) && (root1 right is equal to root2 right) than, return true OR
            // (root1 left is equal to root2) right && (root1 right is equal to root2 left) than, return true
            // both the case are not true than, return false
            return (flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right) ||
                    flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left));
        }
    }
}

// Output -
/*
Input: root1 = [1,2,3,4,5,6,null,null,null,7,8], root2 = [1,3,2,null,6,4,5,null,null,null,null,8,7]
Output: true
Explanation: We flipped at nodes with values 1, 3, and 5.
*/

// Time & Space Complexity -
/*
Time - O(n), where n is the number of nodes
Space - O(n), because of recursive stack is created in memory
*/