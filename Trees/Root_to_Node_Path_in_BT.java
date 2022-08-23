package Trees;

import java.util.ArrayList;

public class Root_to_Node_Path_in_BT {
    // Description of Binary Tree Node
    class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public class Solution {
        // Get Path Function
        static boolean getPath(Node root, ArrayList<Integer> arr, int x) {
            // if root is NULL
            // there is no path
            if (root == null)
                return false;

            // push the node's value in 'arr'
            arr.add(root.data);

            // if it is the required node
            // return true
            if (root.data == x)
                return true;

            // else check whether the required node lies
            // in the left subtree or right subtree of
            // the current node
            if (getPath(root.left, arr, x) ||
                    getPath(root.right, arr, x))
                return true;

            // required node does not lie either in the
            // left or right subtree of the current node
            // Thus, remove current node's value from
            // 'arr'and then return false
            arr.remove(arr.size() - 1);
            return false;
        }

        // Main Function
        /* public static void main(String args[]) {
            Node root = new Node(1);
            root.left = new Node(2);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.left.right.left = new Node(6);
            root.left.right.right = new Node(7);
            root.right = new Node(3);

            ArrayList < Integer > arr = new ArrayList < > ();

            boolean res;
            res = getPath(root, arr, 7);

            System.out.print("The path is ");
            for (int it: arr) {
                System.out.print(it + " ");
            }
        }
        */
    }
}

// Output -
/*
Input : 1,2,4,5,6,7,3
Output : 1,2,5,7
 */

// Approach -
/*
We will use an external list to store our path. This list will be passed by reference to our recursive function.
Moreover, we can set the return value of our function as boolean, this will help us to know whether node V was
found in a subtree or not.

The algorithm steps can be stated as follows:

1. We pass the function with our root node, the path list and node V.
2. For the base case, if root is pointing to NULL, we return false as clearly node V can’t be found.
3. Now we first push the node to our path list.
4. Then we check whether the current node is the target node or not, if it is then no further execution is needed
   and we return to the parent function.
5. If not, then we recursively call its left and right child to find the target node V. If any one of them returns true,
   it means we have found node V at lower levels and return true from the current function.
6. If the value is not found at the current node and neither in any of the recursive calls, it means that the value
   is not present in the current sub-tree, therefore we pop out the current node from the path list and return false.
 */

// Time & Space Complexity -
/*
Time - O(n), We are doing a simple inorder tree traversal.
Space - O(n), In the worst case (skewed tree), space complexity can be O(N).
*/