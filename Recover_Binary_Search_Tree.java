public class Recover_Binary_Search_Tree {


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
        // Initialize variable prev, first & second to null
        public TreeNode prev = null, first = null, second = null;

        // Recover Tree Function
        public void recoverTree(TreeNode root) {
            // call fixBST function
            fixBST(root);
            // swap function
            int temp = first.val;
            first.val = second.val;
            second.val = temp;
        }

        // Fix BST Function
        public void fixBST(TreeNode curr) {
            // if, root is not null
            if (curr != null) {
                // recursive call for left subtree
                fixBST(curr.left);
                // if, prev is not null & prev value is
                // greater than current value
                if (prev != null && prev.val > curr.val) {
                    // check, if first is null
                    // then prev value is add on first
                    if (first == null) {
                        first = prev;
                    }
                    // else, current value is add on second
                    second = curr;
                }
                // in each iteration current value is add on prev
                prev = curr;
                // recursive call for right subtree
                fixBST(curr.right);
            }
        }
    }
}

// Output -
/*
Input: root = [1,3,null,null,2]
Output: [3,1,null,null,2]
Explanation: 3 cannot be a left child of 1 because 3 > 1. Swapping 1 and 3 makes the BST valid.
*/

// Idea -
/*
Using Inorder Traversal
*/

// Time & Space Complexity -
/*
Time _ O(n)
Space _ O(1), because we not consider recursive stack
*/