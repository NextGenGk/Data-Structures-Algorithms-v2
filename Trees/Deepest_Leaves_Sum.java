package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Deepest_Leaves_Sum {

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
        // Deepest Leaves Sum Function
        public int deepestLeavesSum(TreeNode root) {
            // create a queue
            Queue<TreeNode> q = new LinkedList<>();
            // added root value to the queue
            q.offer(root);
            // initialize sum with 0
            int sum = 0;
            // while, queue is not empty
            while (!q.isEmpty()) {
                // calculate size
                int size = q.size();
                sum = 0;
                // while, size is greater than zero
                while (size > 0) {
                    // remove curr element
                    root = q.poll();
                    // & added to sum variable
                    sum += root.val;
                    // & decrease the size by one
                    size--;

                    // if, root left is not null
                    // root left is added to the queue
                    if (root.left != null)
                        q.add(root.left);

                    // if, root right is not null
                    // root right is added to the queue
                    if (root.right != null)
                        q.add(root.right);
                }
            }
            // finally, return deepest leaves sum
            return sum;
        }
    }
}

// output -
/*
Input: root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
Output: 15
*/

// Logic -
/* Same as Level Order Traversal */

// Time & Space Complexity -
/*
Time - O(n)
Space - O(h), in worst case O(n)
*/