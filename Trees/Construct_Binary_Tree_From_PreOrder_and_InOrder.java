package Trees;

import java.util.HashMap;

public class Construct_Binary_Tree_From_PreOrder_and_InOrder {

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
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            // create a hashMap
            HashMap<Integer, Integer> hm = new HashMap<>();

            // put the value of inorder in hashMap
            for (int i = 0; i < inorder.length; i++) {
                hm.put(inorder[i], i);
            }

            // call construct tree function
            return constructTree(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1, hm);
        }

        // construct tree function
        public TreeNode constructTree(int[] preorder, int[] inorder, int preStart, int preEnd, int inStart, int inEnd, HashMap<Integer, Integer> hm) {
            // if preStart is greater than preEnd OR
            // inStart is greater than inEnd, in these case return null
            if (preStart > preEnd || inStart > inEnd) return null;

            // create a node and assign value of preorder last element value
            TreeNode root = new TreeNode(preorder[preStart]);
            // get value from hashmap of last element of preorder
            int inorderRoot = hm.get(preorder[preStart]);

            // calculate left & right size of tree
            int leftSizeTree = inorderRoot - inStart;
            int rightSizeTree = inEnd - inorderRoot;

            // recursive call for left side
            root.left = constructTree(preorder, inorder, preStart + 1, preStart + leftSizeTree, inStart, inorderRoot - 1, hm);
            // recursive call for right side
            root.right = constructTree(preorder, inorder, preEnd - rightSizeTree + 1, preEnd, inorderRoot + 1, inEnd, hm);

            // finally, return root
            return root;
        }
    }
}

// Output -
/*
Example 1:
Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
Output: [3,9,20,null,null,15,7]

Example 2:
Input: preorder = [10,20,40,50,30,60], inorder = [40,20,50,10,60,30]
Output: [10,20,30,40,50,60]
*/

// Time & Space Complexity -
/*
Time - O(n), Assumption: Hashmap returns the answer in constant time.
Space - O(n) Reason: We are using an external hashmap of size ‘N’.
*/