package Trees;

public class Maximum_BT {

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
        // Construct Maximum Binary Tree
        public TreeNode constructMaximumBinaryTree(int[] nums) {
            // base case
            if (nums == null) return null;
            // call findMax Function
            return findMax(nums, 0, nums.length - 1);
        }

        // Find Maximum Function
        public TreeNode findMax(int[] nums, int start, int end) {
            // Same as Binary Search
            if (start > end) return null;

            // find maximum value
            int idxMax = start;
            for (int i = start + 1; i <= end; i++) {
                if (nums[i] > nums[idxMax]) {
                    idxMax = i;
                }
            }

            // create a root and add the maximum value
            TreeNode root = new TreeNode(nums[idxMax]);

            // recursive call for left & right subtree
            root.left = findMax(nums, start, idxMax - 1);
            root.right = findMax(nums, idxMax + 1, end);

            // finally, return true
            return root;
        }
    }
}

// Output -
/*
Input: nums = [3,2,1,6,0,5]
Output: [6,3,5,null,2,0,null,null,1]
Explanation: The recursive calls are as follow:
- The largest value in [3,2,1,6,0,5] is 6. Left prefix is [3,2,1] and right suffix is [0,5].
    - The largest value in [3,2,1] is 3. Left prefix is [] and right suffix is [2,1].
        - Empty array, so no child.
        - The largest value in [2,1] is 2. Left prefix is [] and right suffix is [1].
            - Empty array, so no child.
            - Only one element, so child is a node with value 1.
    - The largest value in [0,5] is 5. Left prefix is [0] and right suffix is [].
        - Only one element, so child is a node with value 0.
        - Empty array, so no child.
*/

// Logic -
/* Same as Binary search & call for left & right subtree */

// Time & Space Complexity -
/*
Time - O(n)
Space - O(n), because of recursive call stack in memory
*/