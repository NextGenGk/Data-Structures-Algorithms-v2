package Trees;

import java.util.ArrayList;
import java.util.List;

public class Unique_Binary_Search_Tree_II {

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
        // Helper Function of Unique BST
        public List<TreeNode> solve(int start, int end) {
            // create a list
            List<TreeNode> list = new ArrayList<>();

            // in, any case start is greater than end,
            // add null value in list, & return this list
            if (start > end) {
                list.add(null);
                return list;
            }

            // looping through last element
            for (int i = start; i <= end; i++) {
                // recursive call for left subtree
                List<TreeNode> left = solve(start, i - 1);
                // recursive call for right subtree
                List<TreeNode> right = solve(i + 1, end);

                // iterate through left tree & right tree
                // & added to the list
                for (TreeNode l : left) {
                    for (TreeNode r : right) {
                        list.add(new TreeNode(i, l, r));
                    }
                }
            }
            // finally, return list
            return list;
        }

        // Generate Tree Function
        public List<TreeNode> generateTrees(int n) {
            // call helper function
            return solve(1, n);
        }
    }
}

// Output -
/*
Input: n = 3
Output: [[1,null,2,null,3],[1,null,3,2],[2,1,3],[3,1,null,null,2],[3,2,null,1]]
*/

/* Catalan Number - The first few Catalan numbers for
/ n = 0, 1, 2, 3, … are 1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862, …
*/

// Idea -
/*
Formula of Catalan Number- (C)n = (C)i (C)n-i-1
*/

// Time & Space Complexity -
/*
Time - O(n2)
Space - O(n)
*/