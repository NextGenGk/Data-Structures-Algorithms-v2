package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binary_Tree_Level_Order_Traversal {

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
        // Level Order Traversal Function
        public List<List<Integer>> levelOrder(TreeNode root) {
            // create a Queue
            Queue<TreeNode> queue = new LinkedList<>();
            // create a List
            List<List<Integer>> ans = new ArrayList<>();

            // if, root is null, return ans
            if (root == null) {
                return ans;
            }

            // queue.add root
            queue.add(root);

            // while queue is not empty
            while (!queue.isEmpty()) {
                // calculate size
                int size = queue.size();

                // create a list of integer
                List<Integer> list = new ArrayList<>();

                // while size is greater than zero
                // then remove the current value
                // and than list.add current value
                // & decrease the size by one
                while (size > 0) {
                    TreeNode curr = queue.poll();
                    list.add(curr.val);
                    size--;

                    // if, left subtree is not null
                    // add this on queue
                    if (curr.left != null) {
                        queue.add(curr.left);
                    }

                    // if, right subtree is not null
                    // add this on queue
                    if (curr.right != null) {
                        queue.add(curr.right);
                    }
                }
                // & then ans to add list
                ans.add(list);
            }
            // finally, return ans
            return ans;
        }
    }
}

// Output -
/*
Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(n)
*/