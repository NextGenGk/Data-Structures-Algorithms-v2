package Trees;

public class Delete_Node_in_a_BST {

    //Definition for a binary tree node.
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
        // Delete Node Function
        public TreeNode deleteNode(TreeNode root, int key) {
            // Search for a node to remove.
            // if, root is null return null
            if (root == null) return root;

            // if, key is smaller than root value
            // goes to the root left
            if (key < root.val) {
                root.left = deleteNode(root.left, key);
            }
            // if, key is greater than root value
            // goes to the root right
            else if (key > root.val) {
                root.right = deleteNode(root.right, key);
            }
            // Deletion of node & set the Binary Tree
            // else, if, root left is null
            // than goes to the right side
            else {
                if (root.left == null) {
                    return root.right;
                }
                // if, root right is null
                // than goes to the left side
                else if (root.right == null) {
                    return root.left;
                }
                // Find successor of right value
                // & added to the (node to be deleted) root value
                root.val = successor(root.right);
                // & set the value of root right
                root.right = deleteNode(root.right, root.val);
            }
            // Finally, return root
            return root;
        }

        // FInd Inorder Successor
        public static int successor(TreeNode root) {
            // root value is (node to be deleted)
            int min = root.val;
            // while, left is not null
            while (root.left != null) {
                // update min & root
                min = root.left.val;
                root = root.left;
            }
            // return
            return min;
        }
    }
}

// Output -
/*
Input: root = [5,3,6,2,4,null,7], key = 3
Output: [5,4,6,2,null,null,7]
Explanation: Given key to delete is 3. So we find the node with value 3 and delete it.
One valid answer is [5,4,6,2,null,null,7], shown in the above BST.
Please notice that another valid answer is [5,2,6,null,4,null,7] and it's also accepted.
*/

// Algorithm -
/*
1) Node to be deleted is the leaf: Simply remove from the tree.
              50                            50
           /     \         delete(20)      /   \
          30      70       --------->    30     70
         /  \    /  \                     \    /  \
       20   40  60   80                   40  60   80
2) Node to be deleted has only one child: Copy the child to the node and delete the child

              50                            50
           /     \         delete(30)      /   \
          30      70       --------->    40     70
            \    /  \                          /  \
            40  60   80                       60   80
3) Node to be deleted has two children: Find inorder successor of the node. Copy contents of the inorder successor to the node and delete the inorder successor. Note that inorder predecessor can also be used.

              50                            60
           /     \         delete(50)      /   \
          40      70       --------->    40    70
                 /  \                            \
                60   80                           80
The important thing to note is, inorder successor is needed only when the right child is not empty. In this particular case, inorder successor can be obtained by finding the minimum value in the right child of the node.
 */

// Time & Space Complexity -
/*
Time - O(n)
Space - O(n)
*/