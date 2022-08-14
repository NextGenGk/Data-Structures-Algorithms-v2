package Trees;

public class Lowest_Common_Ancestor_of_Binary_Tree {

    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        // Lowest Common Ancestor of Binary Tree Function
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            // if, root is null, return null
            if(root == null) return null;

            // if, root value is p OR q, return root
            if(p == root || q == root) return root;

            // recursive call for left subtree
            TreeNode left = lowestCommonAncestor(root.left, p, q);
            // recursive call for right subtree
            TreeNode right = lowestCommonAncestor(root.right, p, q);

            // if, left is null, means (value found in right side)
            if(left == null) return right;
            // if, right is null, return left (value found in left side)
            if(right == null) return left;

            // finally, return root
            return root;
        }
    }
}

// Output -
/*
Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
Output: 6
Explanation: The LCA of nodes 2 and 8 is 6.
*/

// Algorithm -
/*
// define a as p & b as q
1. curr == a || curr == b
2. a -> left subtree, b -> right subtree
3. both a & b in any of subtree
4. none of a & b in any subtree
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(n)
*/