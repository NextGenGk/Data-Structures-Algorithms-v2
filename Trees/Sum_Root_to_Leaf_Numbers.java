package Trees;

public class Sum_Root_to_Leaf_Numbers {

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
        int total;

        // Sum Number Function
        public int sumNumbers(TreeNode root) {
            total = 0;
            helper(root, 0);
            return total;
        }

        // Helper Function
        public void helper(TreeNode root, int sum) {
            if (root == null) return;

            // Formula of find root sum
            sum = sum * 10 + root.val;

            // isLeaf
            if (root.left == null && root.right == null) {
                total += sum;
                return;
            }

            // recursive call for left & right
            helper(root.left, sum);
            helper(root.right, sum);
        }
    }
}

// Output -
/*
Input: root = [1,2,3]
Output: 25
Explanation:
The root-to-leaf path 1->2 represents the number 12.
The root-to-leaf path 1->3 represents the number 13.
Therefore, sum = 12 + 13 = 25.
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(h)
*/