package Trees;

public class Count_Complete_Tree_Nodes {

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
        // Count Nodes Function
        public int countNodes(TreeNode root) {
            // If, root is null, return 0
            if (root == null) {
                return 0;
            }

            // recursive call for left subtree
            int leftSubTree = countNodes(root.left);
            // recursive call for right subtree
            int rightSubTree = countNodes(root.right);

            // Add this two subtree and add 1 to it
            return leftSubTree + rightSubTree + 1;
        }
    }
}

// Output -
/*
Input: root = [1,2,3,4,5,6]
Output: 6
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(n)
*/