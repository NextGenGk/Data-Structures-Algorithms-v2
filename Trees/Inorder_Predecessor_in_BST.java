package Trees;

public class Inorder_Predecessor_in_BST {
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
        // Inorder Predecessor Function
        public TreeNode inorderPredecessor(TreeNode root, TreeNode p) {
            // initialize predecessor to null
            TreeNode predecessor = null;

            // while, root is not equal to null
            while (root != null) {
                // if given value is less than root value
                // than root goes to root left
                if (p.val <= root.val) {
                    root = root.left;
                }
                // else, means value is present in right side
                // then root is added in predecessor
                // & root moves to root right
                else {
                    predecessor = root;
                    root = root.right;
                }
            }
            // finally, return predecessor value
            return predecessor;
        }
    }
}

// Idea -
/*
A node's predecessor in a BST is the greatest value present in its left subtree
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
Hence, successor of 8 is 10.
 */

// Time & Space Complexity -
/*
Time - O(h)
Space - O(1)
 */