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
        public int minNode, maxNode, maxSize;

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

// Output -
/*
Input:
      5
    /  \
   2    4
 /  \
1    3

Output: 3
The following subtree is the
maximum size BST subtree
 */

// Idea -
/*
1. Post Order Traversal

2.      node
        /  \
  largest  smallest

3. left subtree is smaller than root & right subtree is greater than root
 */

// Algorithm -
/*
1. if, root is null min have the greatest value & max have the smallest value & size is 0
2. recursive call for left & right subtree
3. check, if valid bst or not, if isValidBst then
    check if largest < node value < smallest
4. otherwise,
    size - max(leftSize, rightSize)
    min - very min
    max - very max
 */

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1), recursive stack is not count
 */