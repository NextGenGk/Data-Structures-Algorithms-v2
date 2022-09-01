package Trees;

public class Check_for_Children_Sum_Property {

    // Definition of Binary Node
    static class Node {
        int data;
        Node  left,  right;
        Node(int data)
        {
            this.data=data;
            left=null;
            right=null;
        }
    }

    // Reorder Function
    static void reorder(Node  root) {
        // base case
        if (root == null) return;
        int child = 0;
        // if, left value is exist, than added to the child
        if (root.left !=null) {
            child += root.left.data;
        }
        // if, right value is exist, than added to the child
        if (root.right !=null) {
            child += root.right.data;
        }

        // if child is greater than root value, then child value is added to the root
        if (child >= root.data) root.data = child;
        // else,
        else {
            // if, root left is exist
            if (root.left != null) root.left.data = root.data;
            else if (root.right != null) root.right.data = root.data;
        }

        // & than move to the left and right
        // move come, move come
        reorder(root.left);
        reorder(root.right);

        // when we come back, we simply add left and right child value
        // and assign to the root
        int total = 0;
        if (root.left != null) total += root.left.data;
        if (root.right != null) total += root.right.data;
        if (root.left != null || root.right!=null) root.data = total;
    }

    // Change Tree Function
    static void changeTree(Node root) {
        // call reorder function
        reorder(root);
    }

    // Main Function
    public static void main(String[] args) {
        Node  root = new Node(2);
        root.left = new Node(35);
        root.left.left = new Node(2);
        root.left.right = new Node(3);
        root.right = new Node(10);
        root.right.left = new Node(5);
        root.right.right = new Node(2);
        changeTree(root);
    }
}

// Output -
/*

 */

// Approach -
/*
1. We perform a simple dfs traversal on the tree.
2. For the base case, if the node is pointing to NULL, we simply return.
3. At every node, first we find the sum of values of the children( For a NULL child, value is assumed to be 0).
4. If node’s value > sum of children node value, we assign both the children’s value to their parent’s node value.
5. Then we visit the children using recursion.
6. After we return to the node after visiting its children, we explicitly set its value to be equal to the sum of
 its values of its children.
 */

// Time & Space Complexity -
/*
Time - O(n), where n is the numbers of node in given tree
Space - O(h), where h is the height of the tree
in worst case space is O(n)
 */