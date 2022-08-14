public class Insert_Into_a_BST {

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
        /* Insert Into BST Function (Using Iteration) */
        public TreeNode insertIntoBST(TreeNode root, int val) {
            // create a node and add value on it
            TreeNode newNode = new TreeNode(val);
            // declare two variable current, parent
            // current initialize to root & parent to null
            TreeNode curr = root;
            TreeNode parent = null;

            // while current is not null
            while (curr != null) {
                // in each iteration parent is initialize to current
                parent = curr;
                // if, given value is smaller than current value
                // then, added the current left value to current
                if (val < curr.val) {
                    curr = curr.left;
                }
                // else, added the current right value to current
                else {
                    curr = curr.right;
                }
            }

            // if, parent is null means, root is empty
            // then new Node added to the parent, then return parent
            if (parent == null) {
                parent = newNode;
                return parent;
            }
            // else if, value is smaller than parent value
            // then new Node added to the left side of parent
            else if (val < parent.val) {
                parent.left = newNode;
            }
            // else, new Node added to the right side of parent
            else {
                parent.right = newNode;
            }
            // finally, return root
            return root;
        }
    }

// Output -
/*
Input: root = [4,2,7,1,3], val = 5
Output: [4,2,7,1,3,5]
Explanation: Another accepted tree is:
*/

// Time & Space Complexity -
/*
Time - O(h), means O(logn)
Space - O(1),
*/

     /* Insert Into BST Function (Using Recursion) */
     public TreeNode insertIntoBST(TreeNode root, int val) {
         // if, root is null
         // then create a new node & add the value on it
         if(root == null) {
             return new TreeNode(val);
         }

         // if, given value is smaller than root
         // add the value on thr left side
         if(root.val > val) {
             root.left = insertIntoBST(root.left, val);
         }
         // if, given value is greater than root
         // add the value on the right side
         else if(root.val < val) {
             root.right = insertIntoBST(root.right, val);
         }
         // finally, return root
         return root;
     }
}
// Output -
/*
Input: root = [4,2,7,1,3], val = 5
Output: [4,2,7,1,3,5]
Explanation: Another accepted tree is:
*/

// Time & Space Complexity -
/*
Time - O(h), means O(logn)
Space - O(h), means O(logn)
*/
