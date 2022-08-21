package Trees;

public class Largest_BST_in_BT {


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

    // Create a class NodeValue
    class NodeValue {
        public int maxNode, minNode, maxSize;

        NodeValue(int minNode, int maxNode, int maxSize) {
            this.maxNode = maxNode;
            this.minNode = minNode;
            this.maxSize = maxSize;
        }
    };

    class Solution {
        // Largest BST Subtree Helper Function
        private NodeValue largestBSTSubtreeHelper(TreeNode root) {
            // An empty tree is a BST of size 0.
            if (root == null) {
                return new NodeValue(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
            }

            // Get values from left and right subtree of current tree.
            NodeValue left = largestBSTSubtreeHelper(root.left);
            NodeValue right = largestBSTSubtreeHelper(root.right);

            // Current node is greater than max in left AND smaller than min in right, it is a BST.
            if (left.maxNode < root.val && root.val < right.minNode) {
                // It is a BST.
                return new NodeValue(Math.min(root.val, left.minNode), Math.max(root.val, right.maxNode),
                        left.maxSize + right.maxSize + 1);
            }

            // Otherwise, return [-inf, +inf] so that parent can't be valid BST
            return new NodeValue(Integer.MIN_VALUE, Integer.MAX_VALUE,
                    Math.max(left.maxSize, right.maxSize));
        }

        // Largest BST Subtree Function
        public int largestBSTSubtree(TreeNode root) {
            // call largestBstSubtreeHelper
            return largestBSTSubtreeHelper(root).maxSize;
        }
    }
}