package Trees;

import java.util.Stack;

public class Binary_Tree_Search_Iterator {

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

    class BSTIterator {
        // create a stack
        private Stack<TreeNode> stack = new Stack<>();

        // BST Iterator Function
        public BSTIterator(TreeNode root) {
            // push root into stack
            pushAll(root);
        }

        /**
         * @return the next smallest number
         */
        public int next() {
            // remove stack top element
            TreeNode temp = stack.pop();
            // if right is exist
            // all elements of the right is push into stack
            pushAll(temp.right);
            // & return val of stack pop element
            return temp.val;
        }

        /**
         * @return whether we have a next smallest number
         */
        public boolean hasNext() {
            // if, stack is not empty, return true
            // else, false
            if (!stack.isEmpty()) {
                return true;
            } else {
                return false;
            }

            // return !stack.isEmpty();
        }

        // push all the node in left into stack
        // push all the node in left into stack
        private void pushAll(TreeNode node) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
        }
    }
}

/*
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */

// Output -
/*
Input
["BSTIterator", "next", "next", "hasNext", "next", "hasNext", "next", "hasNext", "next", "hasNext"]
[[[7, 3, 15, null, null, 9, 20]], [], [], [], [], [], [], [], [], []]
Output
[null, 3, 7, true, 9, true, 15, true, 20, false]
*/

// Time & Space Complexity -
/*
Time - O(h)
Space - O(1)
*/

