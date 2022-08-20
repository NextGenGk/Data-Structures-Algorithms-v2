package Trees;

public class Inorder_Successor_in_BST {
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
        // Inorder Successor Function
        public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
            // initialize predecessor to null
            TreeNode successor = null;

            // while, root is not equal to null
            while (root != null) {
                // if given value is greater than root value
                // than root goes to root right
                if (p.val >= root.val) {
                    root = root.right;
                }
                // else, means value is present in left side
                // then root is added in predecessor
                // & root moves to root left
                else {
                    successor = root;
                    root = root.left;
                }
            }
            // finally, return successor
            return successor;
        }
    }
}

// Idea -
/*
A node's successor in a BST is the smallest value present in its right subtree
 */

// Output -
/*
Input:
             20
            /   \
           8     22
          / \
         4   12
            /  \
           10   14
K(data of x) = 8
Output: 10
Explanation:
Inorder traversal: 4 8 10 12 14 20 22
Hence, successor of 8 is 12.
 */

// Time & Space Complexity -
/*
Time - O(h)
Space - O(1)
 */
