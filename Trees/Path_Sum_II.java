package Trees;

import java.util.ArrayList;
import java.util.List;

public class Path_Sum_II {

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
        // Path Sum Function
        public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            // create a list which store all paths
            List<List<Integer>> allPaths = new ArrayList<>();
            // call find path function
            findPaths(root, targetSum, new ArrayList<Integer>(), allPaths);
            // return paths
            return allPaths;
        }

        // Find Paths Function
        public void findPaths(TreeNode root, int targetSum, List<Integer> currPath, List<List<Integer>> allPaths) {
            // base case
            if (root == null) return;

            // root value is add on current path
            currPath.add(root.val);
            // isLeaf
            if (root.left == null && root.right == null && targetSum == root.val) {
                // if root to leaf path is equal to targetSum
                // then current path add on allPaths, & return
                allPaths.add(new ArrayList<Integer>(currPath));
            } else {
                // recursive call for left side
                findPaths(root.left, targetSum - root.val, currPath, allPaths);
                // recursive call for right side
                findPaths(root.right, targetSum - root.val, currPath, allPaths);
            }
            // backtracking (remove the current path size - 1)
            currPath.remove(currPath.size() - 1);
        }
    }
}

// Output -
/*
Input: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
Output: [[5,4,11,2],[5,8,4,5]]
Explanation: There are two paths whose sum equals targetSum:
5 + 4 + 11 + 2 = 22
5 + 8 + 4 + 5 = 22
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(n)
*/