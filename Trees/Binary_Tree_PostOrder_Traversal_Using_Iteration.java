package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Binary_Tree_PostOrder_Traversal_Using_Iteration {

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
        // PostOrder Traversal (Using Iteration)
        public List<Integer> postorderTraversal(TreeNode root) {
            // create a list which stores result
            List<Integer> res = new ArrayList<>();
            // base case
            if(root == null) return res;

            // create a stack
            Stack<TreeNode> stack = new Stack<>();

            // while, root is not null OR stack is not empty
            while(root != null || !stack.isEmpty()) {
                // if, root is not null
                // than push root to the stack & goes left
                if(root != null) {
                    stack.push(root);
                    root = root.left;
                }
                // else,
                else {
                    // store top element in variable temp
                    TreeNode temp = stack.peek().right;
                    // if, temp is null
                    // than remove top element of stack and added to the result
                    if(temp == null) {
                        temp = stack.peek();
                        stack.pop();
                        res.add(temp.val);
                        // while, stack is not empty & temp is equal to top right
                        // in this case remove top element of stack and added to the result
                        while(!stack.isEmpty() && temp == stack.peek().right) {
                            temp = stack.peek();
                            stack.pop();
                            res.add(temp.val);
                        }
                    }
                    // else, temp is assign to root (goes root right)
                    else {
                        root = temp;
                    }
                }
            }
            // finally, return result
            return res;
        }
    }
}


// Output -
/*
Input: root = [1,null,2,3]
Output: [3,2,1]
*/

// Algorithm -
/*
PostOrder - Left SubTree -> Right SubTree -> Root
PostOrder - left -> right -> root
    /\
   / /
  /
  \
   \
*/

// Time & Space Complexity -
/*
Time - O(n), where n is the number of nodes in given tree
Space - O(n),  where n is the auxiliary stack in memory
*/