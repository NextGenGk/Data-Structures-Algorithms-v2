import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_InOrder_Traversal {

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
        // InOrder Function
        public static List<Integer> inOrder(TreeNode root, List<Integer> list) {
            // If, root is null, return list
            if (root == null) return list;

            // recursive call for left subtree
            inOrder(root.left, list);
            // add root node value
            list.add(root.val);
            // recursive call for right subtree
            inOrder(root.right, list);
            return list;
        }

        // InOrder Traversal Function
        public List<Integer> inorderTraversal(TreeNode root) {
            // Create a list
            List<Integer> list = new ArrayList<>();
            // return, inOrder list function
            return inOrder(root, list);
        }
    }
}

// Output -
/*
Input: root = [1,null,2,3]
Output: [1,3,2]
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(n)
*/