package Trees;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Paths {

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
        // Binary Tree Paths Function
        public List<String> binaryTreePaths(TreeNode root) {
            // create a list
            List<String> answer = new ArrayList<String>();
            // if, root is not null
            // recursive call for searchBt Function
            if (root != null) searchBT(root, "", answer);
            // finally, return answer
            return answer;
        }

        // searchBT Function
        void searchBT(TreeNode root, String path, List<String> answer) {
            // if, root left is null & root right is null
            // then add the root value to the path
            if (root.left == null && root.right == null) answer.add(path + root.val);
            // if, root left is not null, then recursive call for searchBT Function
            if (root.left != null) searchBT(root.left, path + root.val + "->", answer);
            // if, root right is not null, then recursive call for searchBT Function
            if (root.right != null) searchBT(root.right, path + root.val + "->", answer);
        }
    }
}

// Output -
/*
Input: root = [1,2,3,null,5]
Output: ["1->2->5","1->3"]

Input: root = [1]
Output: ["1"]
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(n), because we use recursive stack
*/