package Trees;

public class Count_Good_Nodes_in_BT {

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
        // Good Nodes Function
        public int goodNodes(TreeNode root) {
            // call dfs function
            return dfs(root, root.val);
        }

        // dfs function
        public int dfs(TreeNode root, int max) {
            // base case
            if (root == null) return 0;

            // count of nodes
            int count = 0;

            // all the nodes is greater than root value it means this is good nodes
            if (root.val >= max) {
                max = root.val;
                count++;
            }

            // return, counts of good nodes
            return count += dfs(root.left, max) + dfs(root.right, max);
        }
    }
}

// Good Node means -
// all the nodes is greater than root value it means this is good nodes

// Output -
/*
Input: root = [3,3,null,4,2]
Output: 3
Explanation: Node 2 -> (3, 3, 2) is not good, because "3" is higher than it.
*/

// Time & Space Complexity -
/*
Time - O(n), where n is numbers of node
Space - O(h), where h is the height of the tree
*/