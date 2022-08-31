package Trees;

public class Distribute_Coins_in_BT {

    //  Definition for a binary tree node.
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
        static int moves;

        // Distribute Coins Function
        public int distributeCoins(TreeNode root) {
            moves = 0;
            // call helper function
            helper(root);
            // finally, return moves
            return moves;
        }

        // Helper Function
        public int helper(TreeNode root) {
            // base case
            if (root == null) return 0;

            // Traverse left subtree
            int leftPart = helper(root.left);
            // Traverse right
            int rightPart = helper(root.right);
            // Return number of moves to balance
            // current node
            moves += Math.abs(leftPart) + Math.abs(rightPart);

            // Update number of moves
            return root.val + leftPart + rightPart - 1;
        }
    }
}

// Output
/*
Input: root = [3,0,0]
Output: 2
Explanation: From the root of the tree, we move one coin to its left child, and one coin to its right child.
*/

// Logic -
/*
We traverse childs first (post-order traversal), and return the ballance of coins. For example, if we get '+3' from
the left child, that means that the left subtree has 3 extra coins to move out. If we get '-1' from the right child,
 we need to move 1 coin in. So, we increase the number of moves by 4 (3 moves out left + 1 moves in right).
  We then return the final ballance: r->val (coins in the root) + 3 (left) + (-1) (right) - 1 (keep one coin for the root).
*/

// Approach -
/*
Recursive Solution:
The idea is to traverse the tree from leaf to root and consecutively balance all of the nodes. To balance a node,
the number of candy at that node must be 1.
There can be two cases:

1. If a node needs candies, if the node of the tree has 0 candies (an excess of -1 from what it needs),
then we should push a candy from its parent onto the node.
2. If the node has more than 1 candy. If it has say, 4 candies (an excess of 3), then we should push 3 candies off the
node to its parent.

So, the total number of moves from that leaf to or from its parent is excess = abs(num_candies – 1).
Once a node is balanced, we never have to consider this node again in the rest of our calculation.
*/

// Time & Space Complexity -
/*
Time - O(n), where, n is the numbers of node in given tree
Space - O(n), where n is the create recursive stack in memory
*/