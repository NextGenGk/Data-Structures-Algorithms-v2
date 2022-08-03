import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_PreOrder_Traversal {

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

    // PreOrder Function
    public static List<Integer> preOrder(TreeNode root, List<Integer> list) {
        // If, root is null, return list
        if(root == null) {
            return list;
        }

        // add root node value
        list.add(root.val);
        // recursive call for left subtree
        preOrder(root.left, list);
        // recursive call for right subtree
        preOrder(root.right, list);

        // return list
        return list;
    }

    // PreOrder Traversal Function
    public List<Integer> preorderTraversal(TreeNode root) {
        // Create a list
        List<Integer> list = new ArrayList<>();
        // return, preOrder list function
        return preOrder(root, list);
    }
}

// Output -
/*
Input: root = [1,null,2,3]
Output: [1,2,3]
*/

// Algorithm -
/*
PreOrder - Root -> Left SubTree -> Right SubTree
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(n)
*/