package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Check_Completeness_of_BT {

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
        // Is Complete Tree Function
        public boolean isCompleteTree(TreeNode root) {
            // create a variable flag initialize with false
            boolean flag = false;
            // Simply use Level Order Traversal
            Queue<TreeNode> queue = new LinkedList<>();
            // root is added to the queue
            queue.add(root);
            while (!queue.isEmpty()) {
                TreeNode curr = queue.poll();
                // if, curr is null means right most element is missing
                if (curr == null) flag = true;
                else {
                    // if, right most element is mising then return false
                    if (flag) return false;
                    // else, left & right side nodes is added on the queue
                    queue.add(curr.left);
                    queue.add(curr.right);
                }
            }
            // means each level all the nodes are filled than return true
            return true;
        }
    }
}

// Output -
/*
Input: root = [1,2,3,4,5,6]
Output: true
Explanation: Every level before the last is full (i.e. levels with node-values {1} and {2, 3}), and all nodes in the last level ({4, 5, 6}) are as far left as possible.
*/

// Time & Space Complexity -
/*
Time - O(n), where n is the number of nodes.
Space - O(n), where n is the recursive call in stack
*/