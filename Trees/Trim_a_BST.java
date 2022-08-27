package Trees;

public class Trim_a_BST {

    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
        }
    }

    class Solution {
        // Trim BST Function
        public TreeNode trimBST(TreeNode root, int low, int high) {
            // base case
            if (root == null) return null;

            // if, root value is less than low, than recursive call for right subtree
            if (root.val < low) return trimBST(root.right, low, high);
            // if, root value is greater than high, than recursive call for right subtree
            if (root.val > high) return trimBST(root.left, low, high);

            // set left & right value
            root.left = trimBST(root.left, low, high);
            root.right = trimBST(root.right, low, high);

            // finally, return root
            return root;
        }
    }
}

// Output -
/*
Input: root = [1,0,2], low = 1, high = 2
Output: [1,null,2]
*/

// Time & Space Complexity -
/*
Time - O(n), where n is the total numbers of node in given tree
Space - O(n), where n is the recursive stack in memory
*/