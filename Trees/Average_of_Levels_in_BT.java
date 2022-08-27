package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Average_of_Levels_in_BT {

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
        // Average of Levels Function
        public List<Double> averageOfLevels(TreeNode root) {
            // create a list which stores result
            List<Double> res = new ArrayList<>();
            // create a queue
            Queue<TreeNode> q = new LinkedList<>();
            // root is added to the queue
            q.add(root);
            // while q is not empty
            while (!q.isEmpty()) {
                // calculate size of queue
                int size = q.size();
                // create a variable sum which store node values
                long sum = 0;
                // looping till i is less than size
                for (int i = 0; i < size; i++) {
                    // remove current element to the queue
                    TreeNode curr = q.poll();
                    // & added to current value in sum
                    sum += curr.val;

                    // if left & right side is not null
                    // than left and right side is added to the queue
                    if (curr.left != null) q.add(curr.left);
                    if (curr.right != null) q.add(curr.right);
                }
                // average is added to the arraylist
                res.add((double) sum / size);
            }
            // finally, return result
            return res;
        }
    }
}

// Output -
/*
Input: root = [3,9,20,null,null,15,7]
Output: [3.00000,14.50000,11.00000]
Explanation: The average value of nodes on level 0 is 3, on level 1 is 14.5, and on level 2 is 11.
Hence return [3, 14.5, 11].
*/

// Logic -
/*
We use S Level Order Traversal
*/

// Time & Space Complexity -
/*
Time - O(n), where n is the total numbers of node in given tree
Space - O(n), where n is the recursive stack in memory
*/