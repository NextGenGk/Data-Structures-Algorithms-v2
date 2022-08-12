package Trees;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_PostOrder_Traversal {

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
        // PostOrder Function
        public List<Integer> postOrder(TreeNode root, List<Integer> list) {
            // If, root is null, return list
            if (root == null) {
                return list;
            }

            // recursive call for left subtree
            postOrder(root.left, list);
            // recursive call for right subtree
            postOrder(root.right, list);
            // add root node value
            list.add(root.val);

            // return list
            return list;
        }

        // PostOrder Traversal function
        public List<Integer> postorderTraversal(TreeNode root) {
            // Create a list
            List<Integer> list = new ArrayList<>();
            // return, postOrder list function
            return postOrder(root, list);
        }
    }
}

// Output -
/*
Input: root = [1,null,2,3]
Output: [3,2,1]
*/

// Algorithm -
/*
PostOrder - Left SubTree -> Right SubTree -> Root
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(n)
*/