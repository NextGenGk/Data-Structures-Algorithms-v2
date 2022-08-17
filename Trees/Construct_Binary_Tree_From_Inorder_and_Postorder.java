package Trees;

import java.util.HashMap;

public class Construct_Binary_Tree_From_Inorder_and_Postorder {

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
        // Build Tree Function
        public TreeNode buildTree(int[] inorder, int[] postorder) {
            // create a hashMap
            HashMap<Integer, Integer> hm = new HashMap<>();

            // put the value of inorder in hashMap
            for (int i = 0; i < inorder.length; i++) {
                hm.put(inorder[i], i);
            }

            // call construct tree function
            return constructTree(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1, hm);
        }

        // construct tree function
        private TreeNode constructTree(int[] inorder, int[] postorder, int inStart, int inEnd, int postStart, int postEnd, HashMap<Integer, Integer> hm) {
            // if inStart is greater than inEnd OR
            // postStart is greater than postEnd, in these case return null
            if (inStart > inEnd || postStart > postEnd) return null;

            // create a node and assign value of postorder last element value
            TreeNode root = new TreeNode(postorder[postEnd]);

            // get value from hashmap of last element of postorder
            int inorderRoot = hm.get(postorder[postEnd]);

            // calculate left & right size of tree
            int leftTreeSize = inorderRoot - inStart;
            int rightTreeSize = inEnd - inorderRoot;

            // recursive call for left side
            root.left = constructTree(inorder, postorder, inStart, inorderRoot - 1, postStart, postStart + leftTreeSize - 1, hm);
            // recursive call for right side
            root.right = constructTree(inorder, postorder, inorderRoot + 1, inEnd, postEnd - rightTreeSize, postEnd - 1, hm);

            // finally, return root
            return root;
        }
    }
}

// Output -
/*
Example 1:
Input: inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]
Output: [3,9,20,null,null,15,7]

Example 2:
Input: inorder = [4,2,5,1,6,3,7], postorder = [4,5,2,6,7,3,1]
Output: [1,2,3,4,5,6,7]
*/

// Time & Space Complexity -
/*
Time - O(n), Assumption: Hashmap returns the answer in constant time.
Space - O(n) Reason: We are using an external hashmap of size ‘N’.
*/