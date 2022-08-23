package Trees;

public class Minimum_Abs_Difference_in_BST {

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

        int min = Integer.MAX_VALUE; //global variable to store ans
        Integer prev = null; //previous value, which we will use to compare

        // Get Minimum Difference Function
        // When we do inorder traversal on a bst we get all values sorted in increasing order
        // This logic will be applied here
        public int getMinimumDifference(TreeNode root) {
            // base case
            if (root == null) return min;

            // recursive call for left
            getMinimumDifference(root.left);

            // if the prev is not null then we subtract from the value of current node and compare with            global 'min'
            if (prev != null) {
                min = Math.min(min, root.val - prev);
            }

            // in each iteration, update the prev to root val
            prev = root.val;

            // recursive call for right
            getMinimumDifference(root.right);

            // finally, return minimum value of BST
            return min;
        }
    }
}

// Output -
/*
Input: root = [1,0,48,null,null,12,49]
Output: 1
*/

// Logic -
/*
1. Same as inorder traversal (0,1,12,48,49)
2. if the prev is not null then we subtract from the value of current node and compare with global 'min'
3. in each iteration, update the prev to root value
*/

// Time & Space Complexity -
/*
Time - O(n), where n is the total number of nodes in the binary tree
Space - O(h), where h is the height of the tree
*/
