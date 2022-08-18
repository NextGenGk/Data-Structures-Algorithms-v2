package Trees;

public class Flatten_Binary_Tree_to_Linked_List {

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
        // Flatten Binary Tree to Linked List Function
        static void flatten(TreeNode root) {
            // create a variable curr and assign root to it
            TreeNode curr = root;
            // while, curr is not null
            while (curr != null) {
                // check, if curr left is not null
                if (curr.left != null) {
                    // set prev to curr left
                    TreeNode prev = curr.left;
                    // while, curr right is not null
                    while (prev.right != null) {
                        // prev set to prev right
                        prev = prev.right;
                    }
                    // prev right set to curr right
                    prev.right = curr.right;
                    // curr right set to curr left
                    curr.right = curr.left;
                    // curr left set to null
                    curr.left = null;
                }
                // in, each iteration curr moved to curr right
                curr = curr.right;
            }
        }
    }
}

// Output -
/*
Input: root = [1,2,5,3,4,null,6]
Output: [1,null,2,null,3,null,4,null,5,null,6]
*/

// Algorithm -
/*
Approach:

The algorithm can be described as:

1. At a node(say curr) if there exists a left child, we will find the rightmost node in the left subtree(say prev).
2. We will set prev’s right child to cur’s right child,
3. We will then set curr’s right child to it’s left child.
4. We will then move curr to the next node by assigning cur it to its right child
5. We will stop the execution when curr points to null.
*/

// Time & Space Complexity -
/*
Time - O(n)
Reason: Time complexity will be the same as that of a morris traversal
Space - O(1)
Reason: We are not using any extra space.
*/