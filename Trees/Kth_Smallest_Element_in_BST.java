package Trees;

public class Kth_Smallest_Element_in_BST {

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
        // declare two variable count and ans
        int count = 0;
        int ans = 0;

        // Find Kth Element Function
        public void findKthElement(TreeNode root, int k) {
            // if, root left is not null
            // recursive call for left subtree
            if (root.left != null) {
                findKthElement(root.left, k);
            }

            // Each left subtree iteration increase the count by one
            // if, count is equal to k,
            // then add the value of node in variable ans, then return
            count++;
            if (count == k) {
                ans = root.val;
                return;
            }

            // if, root right is not null
            // recursive call for right subtree
            if (root.right != null) {
                findKthElement(root.right, k);
            }
        }

        // Kth Smallest Element Function
        public int kthSmallest(TreeNode root, int k) {
            // call findKthElement Function
            findKthElement(root, k);
            // return ans
            return ans;
        }
    }
}

// Output -
/*
Input: root = [3,1,4,null,2], k = 1
Output: 1
*/

// Idea -
// Simple Inorder left -> root -> right

// Time & Space Complexity -
/*
Time - O(min(K,N))
Space - O(min(K,N))
*/