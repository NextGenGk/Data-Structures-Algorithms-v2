package Trees;

public class Merge_Two_Binary_Tress {

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
        // Merge Trees Function
        public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
            // if, root1 & root2 is null, return null
            if (root1 == null && root2 == null) return null;
            // if oot1 is null, return root2
            if (root1 == null) return root2;
            // if, root2 is null return root1
            if (root2 == null) return root1;

            // create a node and store value of root1 & root2
            TreeNode newNode = new TreeNode(root1.val + root2.val);

            // recursive call for left side
            newNode.left = mergeTrees(root1.left, root2.left);
            // recursive call for right side
            newNode.right = mergeTrees(root1.right, root2.right);

            // finally, return newNode
            return newNode;
        }
    }
}

// Output -
/*
Input: root1 = [1,3,2,5], root2 = [2,1,3,null,4,null,7]
Output: [3,4,5,5,4,null,7]

Input: root1 = [1], root2 = [1,2]
Output: [2,2]
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(n)
*/