package Trees;

import java.util.ArrayDeque;
import java.util.Queue;

public class Minimum_Depth_of_Binary_Tree {

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
        // Minimum Depth Function
        public int minDepth(TreeNode root) {
            // if, root is null return 0
            if (root == null) return 0;

            // create a queue
            Queue<TreeNode> q = new ArrayDeque<>();
            // q.add root
            q.add(root);
            // depth initialize to 1
            int depth = 1;

            // while q is not empty
            while (!q.isEmpty()) {
                // calculate size of queue
                int size = q.size();

                // while, size is greater then 0
                // remove the current element &
                // decrease the size by one
                while (size > 0) {
                    TreeNode curr = q.poll();
                    size--;

                    // if, current left is equal to null &
                    // current right is equal to null, return depth
                    if (curr.left == null && curr.right == null) {
                        return depth;
                    }

                    // if, current left not equal to null
                    // then current left elements is add in queue
                    if (curr.left != null) {
                        q.add(curr.left);
                    }

                    // if, current right not equal to null
                    // then current right elements is add in queue
                    if (curr.right != null) {
                        q.add(curr.right);
                    }
                }
                // in each iteration, increase the depth by one
                depth++;
            }
            // finally, return ans
            return depth;
        }
    }
}

// Output -
/*
Input: root = [3,9,20,null,null,15,7]
Output: 2
*/

// Time & Space Complexity -
/*
Time - O(n), as it traverses the tree only once
Space - O(l), where l is the maximum number of nodes in a single level.
*/