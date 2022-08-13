package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Invert_Binary_Tree {

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
        /* Recursive Approach */
        public TreeNode invertTree(TreeNode root) {
            // if, root is null, return null
            if (root == null) return null;
            // swap function
            TreeNode temp = root.left;
            root.left = invertTree(root.right);
            root.right = invertTree(temp);
            // finally, return root
            return root;
        }

        /* Iterative Approach */
        public TreeNode invertTree2(TreeNode root) {
            // create a queue
            Queue<TreeNode> q = new LinkedList<>();
            // add root value to the queue
            q.add(root);
            // while q is not empty
            while (!q.isEmpty()) {
                // remove (curr) element from the queue
                TreeNode curr = q.poll();
                // if remove (curr) is not null
                // add the left and right child of the node
                if (curr != null) {
                    q.add(curr.left);
                    q.add(curr.right);
                    // swap function
                    // for swap two queue elements
                    TreeNode newTemp = curr.left;
                    curr.left = curr.right;
                    curr.right = newTemp;
                }
            }
            // finally, return root
            return root;
        }
    }
}

// Output -
/*
Input: root = [4,2,7,1,3,6,9]
Output: [4,7,2,9,6,3,1]
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1) ,because, we not considered recursive stack
*/