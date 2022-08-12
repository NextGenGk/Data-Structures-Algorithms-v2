package Trees;

public class Convert_Sorted_Array_to_BST {

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
        // Sorted Array Function
        public TreeNode sortedArrayToBST(int[] nums) {
            // call partition function
            return partition(nums, 0, nums.length - 1);
        }

        // Partition Function
        public TreeNode partition(int[] nums, int left, int right) {
            // if, left is greater than right
            // than, return null
            if (left > right) return null;

            // find middle element
            int mid = left + (right - left) / 2;
            // create a node and add the value of mid
            TreeNode root = new TreeNode(nums[mid]);

            // recursive call for left subtree (left to mid - 1)
            root.left = partition(nums, left, mid - 1);
            // recursive call for right subtree (mid + 1 to right)
            root.right = partition(nums, mid + 1, right);

            // finally, return root
            return root;
        }
    }
}

// Output -
/*
Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: [0,-10,5,null,-3,null,9] is also accepted:
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(logn)
*/