package Trees;

import java.util.HashSet;

public class Two_Sum_IV {

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
        // Find Target Function
        public boolean findTarget(TreeNode root, int k) {
            // create a hashSet
            HashSet<Integer> set = new HashSet<>();
            // return utility function
            return util(root, k, set);
        }

        // Utility Function
        public boolean util(TreeNode root, int k, HashSet<Integer> set) {
            // if, root is null return false
            if (root == null) return false;
            // simply same as inorder traversal (left -> root -> right)
            // recursive call for left
            // means root left side any two value is equal to k then, return true
            if (util(root.left, k, set) == true) {
                return true;
            }

            // if, set contains value of sum - root value
            // in this case, return true
            if (set.contains(k - root.val)) {
                return true;
            }
            // else, root value is added to the set
            set.add(root.val);

            // recursive call for right
            return util(root.right, k, set);
        }
    }
}

// Output -
/*
Input: root = [5,3,6,2,4,null,7], k = 9
Output: true
*/

// Time * Space Complexity -
/*
Time - O(n)
Space - O(n)
*/