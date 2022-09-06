package LinkedList;

public class Binary_Tree_Pruning {

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

    class Solution {
        // Helper Function
//     public int helper(TreeNode root) {
//         // base case
//         if(root == null) {
//             return 0;
//         }

//         // if, isLeaf or not
//         // if, isLeaf & node value is 0 return 0
//         // if, isLeaf & node value is 1 return 1
//         if(root.left == null && root.right == null) {
//             if(root.val == 0) {
//                 return 0;
//             }
//             else {
//                 return 1;
//             }
//         }

//         // recursive call for left & right subtree
//         int leftSubtree = helper(root.left);
//         int rightSubtree = helper(root.right);

//         // if leftSubtree value is equal to zero
//         // than null set to root left
//         if(leftSubtree == 0) {
//             root.left = null;
//         }

//         // if rightSubtree value is equal to zero
//         // than null set to root right
//         if(rightSubtree == 0) {
//             root.right = null;
//         }

//         // else, return leftSubtree, rightSubtree & root value
//         // if, root value is 1, than return 1, else return 0
//         return leftSubtree + rightSubtree + (root.val == 1 ? 1 : 0);
//      }

        // Prune Tree Function
        public TreeNode pruneTree(TreeNode root) {
            // call helper function, if helper function value is
            // equal to 0, than return null
//         if(helper(root) == 0) {
//             return null;
//         }

//         return root;

            // Other Method
            // base case
            if (root == null) return null;
            // recursive call for left & right
            root.left = pruneTree(root.left);
            root.right = pruneTree(root.right);
            // if left & right gives null & root value is equal to 0, than return null
            if (root.left == null && root.right == null && root.val == 0) return null;
            // return root
            return root;
        }
    }
}

// Output -
/*
Input: root = [1,null,0,0,1]
Output: [1,null,0,null,1]
Explanation:
Only the red nodes satisfy the property "every subtree not containing a 1".
The diagram on the right represents the answer.
*/

// Logic -
/*
1. check leaf node, if node value is equal to 1 than return 1 else return 0
2. recursive call for left & right subtree
3. if leftSubtree value is equal to zero than null set to root left
4. if rightSubtree value is equal to zero than null set to root right
5. else, return leftSubtree value, rightSubtree value  & root value if, root value is 1, than return 1, else return 0
6. & than call helper function from function if, helper function is equal to 0
than return null, else return root
*/

// Time & Space Complexity -
/*
Time - O(N)
Space - O(N)
*/