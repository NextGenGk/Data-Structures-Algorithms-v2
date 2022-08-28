package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Binary_Tree_InOrder_Traversal_Using_Iteration {

    // Definition for a binary tree node.
    public class TreeNode {
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

    // Inorder Traversal (Using Iteration)
    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            // create a list which stores result
            List<Integer> res = new ArrayList<>();
            // create a stack
            Stack<TreeNode> stack = new Stack<>();
            // store root in curr variable
            TreeNode curr = root;
            while (true) {
                // if, curr is not null
                // than push curr element on the stack & goes left
                if (curr != null) {
                    stack.push(curr);
                    curr = curr.left;
                }
                // else,
                else {
                    // if, stack is empty, than simply break this iteration
                    if (stack.isEmpty()) break;
                    // remove top element in ths stack
                    // and added to the result list & than goes right
                    curr = stack.pop();
                    res.add(curr.val);
                    curr = curr.right;
                }
            }
            // finally, return list of result
            return res;
        }
    }
}

// Output -
/*
Input: root = [1,null,2,3]
Output: [1,3,2]
*/

// Logic -
/*
InOrder - Left SubTree -> Root -> Right SubTree (Recursion)
InOrder - left -> root -> right (Iteration)
*/

// Time & Space Complexity -
/*
Time - O(n), where n is the number of nodes in given tree
Space - O(n),  where n is the recursive stack in memory
*/