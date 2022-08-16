package Trees;

public class Maximum_Path_Sum {

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
        // Max Path Sum Function
        public int maxPathSum(TreeNode root) {
            // create an array of size 1
            int[] maxValue = new int[1];
            // initialize with minimum value
            maxValue[0] = Integer.MIN_VALUE;
            // call maxPathDown function
            maxPathDown(root, maxValue);
            return maxValue[0];
        }

        // Max Path Down Function
        public static int maxPathDown(TreeNode node, int[] maxValue) {
            // if, node is null, return 0
            if (node == null) return 0;
            // recursive call for left side
            int left = Math.max(0, maxPathDown(node.left, maxValue));
            // recursive call for right side
            int right = Math.max(0, maxPathDown(node.right, maxValue));
            // calculate maximum value
            maxValue[0] = Math.max(maxValue[0], left + right + node.val);
            // return maximum value of left & right
            // and add the node value on it
            return Math.max(left, right) + node.val;
        }
    }
}

// Output -
/*
Input: root = [1,2,3]
Output: 6
Explanation: The optimal path is 2 -> 1 -> 3 with a path sum of 2 + 1 + 3 = 6.
*/

// Time & Space Complexity -
/*
Time - O(n), Reason: We are doing a tree traversal.
Space - O(n), Reason: Space is needed for the recursion stack. In the worst case (skewed tree), space complexity can be O(N).
*/