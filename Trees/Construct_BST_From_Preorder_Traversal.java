package Trees;

public class Construct_BST_From_Preorder_Traversal {
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
        // BST From Preorder Function
        public TreeNode bstFromPreorder(int[] preorder) {
            // call helper function
            return helper(preorder, Integer.MAX_VALUE, new int[]{0});
        }

        // Helper Function
        public TreeNode helper(int[] preorder, int upBound, int[] i) {
            // if i[0] == preorder length OR preorder[i[0]] is greater than upperBound
            // in this case, return null
            if(i[0] == preorder.length || preorder[i[0]] > upBound) return null;
            // create a treeNode and add 1st value to root of the preorder
            // & preorder should increase by 1 step and added to the root variable
            TreeNode root = new TreeNode(preorder[i[0]++]);
            // recursive call for left subtree
            // in this case node value is the upperBound
            root.left = helper(preorder, root.val, i);
            // recursive call for right subtree
            // in this case upperBound is the (previous node) upperBound
            root.right = helper(preorder, upBound, i);
            // finally, return root
            return root;
        }
    }

// Output -
/*
Input: preorder = [8,5,1,7,10,12]
Output: [8,5,10,1,7,null,12]
*/

// Idea -
/*
EXPLANATION-
"explanation- It is  possible to do this because when we construct the " left child " the upper bound will be the node value itself and no lower bound will be needed!
	-no lower bound is required for "right child" because we have arrived at this point of creating the right child only because these elements failed to satisfy the left subtree conditions!"
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
*/
}
