package Trees;

public class Same_Tree {
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
        // Is Same Tree Function
        public boolean isSameTree(TreeNode p, TreeNode q) {
            // if, p is null & q is null, return true
            if (p == null && q == null) return true;
            // if, p is null & q is not null OR
            // p is not null & q is null,
            // in both case, return false;
            if (p == null && q != null || p != null && q == null) return false;

            // if, p value is not equal to q val, return false
            if (p.val != q.val) return false;
            // recursive call for left side subtree
            boolean left = isSameTree(p.left, q.left);
            // recursive call for right side subtree
            boolean right = isSameTree(p.right, q.right);

            // if, both are true, return true
            return left && right;
        }
    }
}

// Output -
/*
Input: p = [1,2,3], q = [1,2,3]
Output: true
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(n), because we use recursive stack
*/