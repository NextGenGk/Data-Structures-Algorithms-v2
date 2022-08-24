package Trees;

public class Subtree_of_Another_Tree {

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
        // isMatch Function
        public boolean isMatch(TreeNode root, TreeNode subRoot) {
            // base case and isLeaf or not
            if (root == null && subRoot == null) return true;

            // if any one of them is not leaf than return false
            if (root == null || subRoot == null) return false;

            // means tree is not null than
            // check if root value is equal to subRoot value
            // than call isMatch function for left & right
            if (root.val == subRoot.val) {
                return isMatch(root.left, subRoot.left) && isMatch(root.right, subRoot.right);
            }

            // check if root value is not equal to subRoot value, than return false
            return false;
        }

        // IsSubTree Function
        public boolean isSubtree(TreeNode root, TreeNode subRoot) {
            // if subroot is null return true
            if (subRoot == null) return true;
            // if root is null return false
            if (root == null) return false;

            // if root value & subroot values are same &
            // if, isMatch function returns true than return true
            if (root.val == subRoot.val) {
                if (isMatch(root, subRoot)) {
                    return true;
                }
            }

            // if root value & subroot values are not same
            // then check left & right side for both trees
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }
    }
}

// Output -
/*
Input: root = [3,4,5,1,2], subRoot = [4,1,2]
Output: true
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(n)
*/