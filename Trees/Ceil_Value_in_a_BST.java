package Trees;

public class Ceil_Value_in_a_BST {
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

    public class Solution {
        // Find Ceil Function
        public  static int findCeil(TreeNode root, int key) {
            // initialize ceil value to -1
            int ceil = -1;
            // while, root is not null
            while (root != null) {
                // check if, root value is equal to given key
                // then root value is add on ceil & then return ceil
                if (root.val == key) {
                    ceil = root.val;
                    return ceil;
                }
                // check if, key is greater than root value
                // in this case move root right
                if (key > root.val) {
                    root = root.right;
                }
                // else, root value is add on ceil
                // & root moves to root left
                else {
                    ceil = root.val;
                    root = root.left;
                }
            }
            // finally, return ceil value
            return ceil;
        }
    }
}

// Idea -
/*
Ceil Value Node: Node with the smallest data larger than or equal to the key value.
 */

// Output -
/*
Input -
          8
        /   \
      4      12
    /  \    /  \
   2    6  10   14
Key = 11
Output - 12
 */

// Time & Space Complexity -
/*
Time - O(logn)
Space - O(logn)
 */
