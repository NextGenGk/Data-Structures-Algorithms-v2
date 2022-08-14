package Trees;

import java.util.ArrayList;
import java.util.List;

public class Morris_Traversal_PreOrder {

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
        public List<Integer> preorderTraversal(TreeNode root) {
            // create a list
            List<Integer> preorder = new ArrayList<Integer>();

            // initialize curr to root
            TreeNode cur = root;
            // while current is not null
            while(cur != null) {
                // if, current left is null, then
                // add this current value to the list
                // & call right side
                if(cur.left == null) {
                    preorder.add(cur.val);
                    cur = cur.right;
                }

                // Find the inorder predecessor of current
                else {
                    TreeNode prev = cur.left;
                    while(prev.right != null && prev.right != cur) {
                        prev = prev.right;
                    }

                    // Make current as right child of its inorder predecessor
                    // & print the value of current
                    // create a link
                    if(prev.right == null) {
                        prev.right = cur;
                        preorder.add(cur.val);
                        cur = cur.left;
                    }

                    // else, remove a link
                    else {
                        prev.right = null;
                        cur = cur.right;
                    }
                }
            }
            return preorder;
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

            // while, current is not null
            while (curr != null) {
                // if, current left is equal to null
                // then, print the data, & call right subtree
                if (curr.left == null) {
                    System.out.print(curr.val + " ");
                    curr = curr.right;
                }
                else {
                    // Find the inorder predecessor of current
                    pred = curr.left;
                    while (pred.right != null
                            && pred.right != curr) {
                        pred = pred.right;
                    }

                    // Make current as right child of its inorder predecessor
                    // & print the value of
                    // create a link
                    if (pred.right == null) {
                        pred.right = curr;
                        System.out.print(curr.val + " ");
                        curr = curr.left;
                    }

                    // else, remove a link
                    else {
                        pred.right = null;
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
1 2 4 5 3
 */

// Algorithm -
/*
1...If left child is null, print the current node data. Move to right child.
….Else, Make the right child of the inorder predecessor point to the current node. Two cases arise:
………a) The right child of the inorder predecessor already points to the current node. Set right child to NULL. Move to right child of current node.
………b) The right child is NULL. Set it to current node. Print current node’s data and move to left child of current node.
2...Iterate until current node is not NULL.
 */

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1) Reason: We are not using recursion
 */