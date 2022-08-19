package Trees;

public class Floor_Value_in_a_BST {
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
        // Floor in BST Function
        public static int floorInBST(TreeNode root, int key) {
            // initialize ceil value to -1
            int floor = -1;
            // while, root is not null
            while (root != null) {
                // check if, root value is equal to given key
                // then root value is add on floor & then return floor
                if (root.val == key) {
                    floor = root.val;
                    return floor;
                }

                // check if, key is greater than root value
                // then root value is add on floor
                // & root moves to root right
                if (key > root.val) {
                    floor = root.val;
                    root = root.right;
                }
                // else, root moves to root left
                else {
                    root = root.left;
                }
            }
            // finally, return floor value
            return floor;
        }
    }
}

// Idea -
/*
Floor Value Node: Node with the greatest data lesser than or equal to the key value.
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
Output - 10
 */

// Time & Space Complexity -
/*
Time - O(logn)
Space - O(logn)
 */