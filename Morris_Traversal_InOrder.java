import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class Morris_Traversal_InOrder {

    // TreeNode Class
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // Question (Morris Traversal)
    static class BinaryTree {
        TreeNode root;
        // InOrder Traversal Function
        public List<Integer> inorderTraversal(TreeNode root) {
            // create a list
            List<Integer> inorder = new ArrayList<Integer>();

            // initialize curr to root
            TreeNode cur = root;
            // while current is not null
            while(cur != null) {
                // if, current left is null, then
                // add this current value to the list
                if(cur.left == null) {
                    inorder.add(cur.val);
                    cur = cur.right;
                }

                // Find the inorder predecessor of current
                else {
                    TreeNode prev = cur.left;
                    while(prev.right != null && prev.right != cur) {
                        prev = prev.right;
                    }

                    // Make current as right child of its inorder predecessor
                    // create a link
                    if(prev.right == null) {
                        prev.right = cur;
                        cur = cur.left;
                    }
                    // Revert the changes made in the 'if' part to restore the original
                    //  tree i.e., fix the right child of predecessor
                    // remove a link
                    else {
                        prev.right = null;
                        inorder.add(cur.val);
                        cur = cur.right;
                    }
                }
            }
            return inorder;
        }
    }

    // Morris Traversal
    static class Solution {
        TreeNode root;

        void MorrisTraversal(TreeNode root) {
            // if root is null, then simply return
            if (root == null) return;

            // initialize variable curr, pred
            TreeNode curr = root;
            TreeNode pred;

            while (curr != null) {
                if (curr.left == null) {
                    System.out.print(curr.val + " ");
                    curr = curr.right;
                } else {
                    // Find the inorder predecessor of current
                    pred = curr.left;
                    while (pred.right != null
                            && pred.right != curr) {
                        pred = pred.right;
                    }

                    // Make current as right child of its inorder predecessor
                    if (pred.right == null) {
                        pred.right = curr;
                        curr = curr.left;
                    }

                    // Revert the changes made in the 'if' part to restore the original
                    //  tree i.e., fix the right child of predecessor
                    else {
                        pred.right = null;
                        System.out.print(curr.val + " ");
                        curr = curr.right;
                    }
                     /* End of if condition pre->right == NULL

                 } /* End of if condition current->left == NULL*/

                } /* End of while */
            }
        }

        // Main Function
        public static void main(String[] args) {
            Solution tree = new Solution();
            tree.root = new TreeNode(1);
            tree.root.left = new TreeNode(2);
            tree.root.right = new TreeNode(3);
            tree.root.left.left = new TreeNode(4);
            tree.root.left.right = new TreeNode(5);

            tree.MorrisTraversal(tree.root);
        }
    }
}

// Output -
/*
4 2 5 1 3
 */

// Algorithm -
/*
1. Initialize current as root
2. While current is not NULL
   If the current does not have left child
      a) Print current’s data
      b) Go to the right, i.e., current = current->right
   Else
      a) Find rightmost node in current left subtree OR
              node whose right child == current.
         If we found right child == current
             a) Update the right child as NULL of that node whose right child is current
             b) Print current’s data
             c) Go to the right, i.e. current = current->right
         Else
             a) Make current as the right child of that rightmost
                node we found; and
             b) Go to this left child, i.e., current = current->left
 */

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1) Reason: We are not using recursion
 */