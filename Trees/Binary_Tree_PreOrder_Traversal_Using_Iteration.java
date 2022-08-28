package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Binary_Tree_PreOrder_Traversal_Using_Iteration {

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
          // Preorder Traversal Function
        public static List<Integer> preorderTraversal(TreeNode root) {
            // create a list which stores ans
            List<Integer> res = new ArrayList<>();
            // base case
            if(root == null) return res;
            // create a stack
            Stack<TreeNode> stack = new Stack<>();
            // added root to the stack
            stack.push(root);

            // while, stack is not empty
            while(!stack.isEmpty()) {
                // remove curr element to the stack
                // and added to the result list
                TreeNode curr = stack.pop();
                res.add(curr.val);

                // if, right & left is not null than
                // right & left is push on the stack
                if(curr.right != null) stack.push(curr.right);
                if(curr.left != null) stack.push(curr.left);
            }
            // finally, return list of result
            return res;
        }
    }
}

// Output -
/*
Input: root = [1,null,2,3]
Output: [1,2,3]
*/

// Logic -
/*
PreOrder - Root -> Left SubTree -> Right SubTree (Recursion)
PreOrder - root -> right -> left (Iteration)
*/

// Time & Space Complexity -
/*
Time - O(n), where n is the number of nodes in given tree
Space - O(n),  where n is the auxiliary stack in memory
*/