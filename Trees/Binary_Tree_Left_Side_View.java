package Trees;

import java.util.ArrayList;

public class Binary_Tree_Left_Side_View {
    //* A Binary Tree node
    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    class Tree {
        // Utility Function of LeftSideView
        public void leftView(Node curr, ArrayList<Integer> list, int level) {
            // if, current is null, return
            if (curr == null) {
                return;
            }

            // if, level = list size
            // add current val to list
            if (level == list.size()) {
                list.add(curr.data);
            }

            // recursive call for left side view
            leftView(curr.left, list, level + 1);
            // recursive call for right side view
            leftView(curr.right, list, level + 1);
        }

        //Function to return list containing elements of left view of binary tree.
        ArrayList<Integer> leftView(Node root) {
            // create a arrayList
            ArrayList<Integer> result = new ArrayList<>();
            // call left view function
            leftView(root, result, 0);
            return result;
        }
    }
}

// Output -
/*
Input:
   1
 /  \
3    2
Output: 1 3
*/

// Algorithm -
/* Left Side View -> 1. Recursive call for left subtree
                      2. Recursive call for right subtree
 */

// Time & Space Complexity -
/*
Time - O(n)
Space - O(h) h = height of binary tree
*/