package Trees;

public class Smallest_Subtree_with_All_the_Deepest_Node {

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
        // initialize variable maxDepth to -1
        int maxDepth = -1;
        // & result is initialize with null
        TreeNode result = null;

        // Subtree With All The Deepest Nodes Function
        public TreeNode subtreeWithAllDeepest(TreeNode root) {
            // call postOrder function
            postOrder(root, 0);
            // return result
            return result;
        }

        // create postOrder Function
        public int postOrder(TreeNode node, int depth) {
            // base case
            if (node == null) return depth;

            // calculate left and right subtree
            int left = postOrder(node.left, depth + 1);
            int right = postOrder(node.right, depth + 1);

            // if, left and right depth are same
            if (left == right) {
                // then max of maxDepth & left or right is store in maxDepth
                // maxDepth has updated means we encountered a new maxDepth
                maxDepth = Math.max(maxDepth, left);
                // if, maxDepth is equal to left
                // then we updated the result to node
                if (maxDepth == left) {
                    result = node;
                }
            }

            // return max of left and right height
            return Math.max(left, right);
        }
    }
}

// Output -
/*
Input: root = [3,5,1,6,2,0,8,null,null,7,4]
Output: [2,7,4]
Explanation: We return the node with value 2, colored in yellow in the diagram.
The nodes coloured in blue are the deepest nodes of the tree.
Notice that nodes 5, 3 and 2 contain the deepest nodes in the tree but node 2 is the smallest subtree among them, so we return it.
*/

// Logic -
/*
1. we use postorder traversal
2. Height of a node = Max of (Height left, Height right)
3. if (Height left == Height right) we need to take that node
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(n), because of recursive call stack in memory
*/