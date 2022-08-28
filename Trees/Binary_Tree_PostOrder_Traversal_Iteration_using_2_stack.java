package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Binary_Tree_PostOrder_Traversal_Iteration_using_2_stack {

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
        // PostOrder Traversal (Iteration using 2 stack)
        public List<Integer> postorderTraversal(TreeNode root) {
            // create a list which store result
            List<Integer> res = new ArrayList<>();
            // base case
            if(root == null) return res;

            // create two stack
            Stack<TreeNode> stack1 = new Stack<>();
            Stack<TreeNode> stack2 = new Stack<>();

            // add root element on stack1
            stack1.push(root);

            // while, stack1 is not empty
            while(!stack1.isEmpty()) {
                // remove the top element on stack1
                root = stack1.peek();
                stack1.pop();
                // and push the element on stack2
                stack2.push(root);

                // if, root left & right is not null than
                // push it into the stack1
                if(root.left != null) stack1.add(root.left);
                if(root.right != null) stack1.add(root.right);
            }

            // removing top element in stack2 & added to the result
            while(!stack2.isEmpty()) {
                res.add(stack2.peek().val);
                stack2.pop();
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

// Time & Space Complexity -
/*
Time - O(n), where n is the number of nodes in given tree
Space - O(n + n),  where 1st n is create two stack & 2nd n is a simple postorder traversal
*/