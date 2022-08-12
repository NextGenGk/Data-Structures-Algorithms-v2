package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binary_Tree_Level_Order_Traversal_II {

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
        // Level Order Bottom Function
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            // create q queue
            Queue<TreeNode> q = new LinkedList<>();
            // create a list
            List<List<Integer>> ans = new ArrayList<>();

            // if, root is null, return ans
            if (root == null) return ans;

            // queue.add root
            q.add(root);

            // while queue is not empty
            while (!q.isEmpty()) {
                // calculate size
                int size = q.size();

                // create a list of integer
                List<Integer> list = new ArrayList<>();

                // while size is greater than zero
                // then remove the current value
                // and than list.add current value
                // & decrease the size by one
                while (size > 0) {
                    TreeNode curr = q.poll();
                    list.add(curr.val);
                    size--;

                    // if, left subtree is not null
                    // add this on queue
                    if (curr.left != null) {
                        q.add(curr.left);
                    }

                    // if, right subtree is not null
                    // add this on queue
                    if (curr.right != null) {
                        q.add(curr.right);
                    }
                }
                // in each iteration, each level is always add on the first position
                ans.add(0, list);
            }
            // finally, return ans
            return ans;
        }
    }
}

// Output -
/*
Input: root = [3,9,20,null,null,15,7]
Output: [[15,7],[9,20],[3]]
*/

// Time & Space Complexity -
/*
Time - O(n) , where n is the number of nodes in the binary tree.
Space - O(n) , where n is the number of nodes in the binary tree.
*/