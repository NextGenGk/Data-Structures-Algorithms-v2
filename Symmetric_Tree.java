public class Symmetric_Tree {

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
            this.right = right;
        }
    }

    class Solution {
        // Is Symmetric Function
        public boolean isSymmetric(TreeNode root) {
            // call Is Same Tree Function
            return isSameTree(root.left, root.right);
        }

        // Is Same Tree Function
        public boolean isSameTree(TreeNode leftRoot, TreeNode rightRoot) {
            // if, leftRoot is null & rightRoot is null, return true
            if (leftRoot == null && rightRoot == null) return true;
            // if, leftRoot is null & rightRoot is not null OR
            // leftRoot is not null & rightRoot is null,
            // in both case, return false;
            if (leftRoot == null && rightRoot != null
                    || leftRoot != null && rightRoot == null) return false;

            // if, leftRoot value is not equal to rightRoot value, return false
            if (leftRoot.val != rightRoot.val) return false;
            // recursive call for left & right subtree
            boolean left = isSameTree(leftRoot.left, rightRoot.right);
            // recursive call for right & left subtree
            boolean right = isSameTree(leftRoot.right, rightRoot.left);

            // if, both are true, return true
            return left && right;
        }
    }
}

// Output -
/*
Input: root = [1,2,2,3,4,4,3]
Output: true
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(n), because we use recursive stack
*/