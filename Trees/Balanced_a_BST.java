package Trees;

import java.util.ArrayList;
import java.util.List;

public class Balanced_a_BST {

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
        // create a list which stores the value of inorder traversal
        List<TreeNode> sortedArr = new ArrayList<>();

        // Balanced BST Function
        public TreeNode balanceBST(TreeNode root) {
            // call inorder Traverse Function
            inorderTraverse(root);
            // return sorted Array to BST Function
            return sortedArrayToBST(0, sortedArr.size() - 1);
        }

        // Inorder Traversal
        public void inorderTraverse(TreeNode root) {
            if (root == null) return;
            inorderTraverse(root.left);
            sortedArr.add(root);
            inorderTraverse(root.right);
        }

        // Same as Binary Search Function
        public TreeNode sortedArrayToBST(int start, int end) {
            if (start > end) return null;
            int mid = start + (end - start) / 2;
            TreeNode root = sortedArr.get(mid);
            root.left = sortedArrayToBST(start, mid - 1);
            root.right = sortedArrayToBST(mid + 1, end);
            return root;
        }
    }
}

// Output -
/*
Input: root = [2,1,3]
Output: [2,1,3]
*/

// Logic -
/*
1. Inorder Traversal of BST
2. & then convert Sorted Array to BST (Same as Binary Search)
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(n)
*/