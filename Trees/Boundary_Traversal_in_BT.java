package Trees;

import java.util.ArrayList;

public class Boundary_Traversal_in_BT {

    static class Node {
        int val;
        Node left, right;
        Node(int val) {
            this.val = val;
            left = null;
            right = null;
        }
    }

    // isLeaf Function
    static Boolean isLeaf(Node root) {
        return (root.left == null) && (root.right == null);
    }

    // Add Left Boundary Function
    static void addLeftBoundary(Node root, ArrayList<Integer> res) {
        Node cur = root.left;
        while (cur != null) {
            if (isLeaf(cur) == false) res.add(cur.val);
            if (cur.left != null) cur = cur.left;
            else cur = cur.right;
        }
    }

    // Add Right Boundary Function
    static void addRightBoundary(Node root, ArrayList <Integer> res) {
        Node cur = root.right;
        ArrayList <Integer> tmp = new ArrayList < Integer > ();
        while (cur != null) {
            if (isLeaf(cur) == false) tmp.add(cur.val);
            if (cur.right != null) cur = cur.right;
            else cur = cur.left;
        }
        // print in reverse order
        int i;
        for (i = tmp.size() - 1; i >= 0; --i) {
            res.add(tmp.get(i));
        }
    }

    // Add Leaves Node Function
    static void addLeaves(Node root, ArrayList <Integer> res) {
        if (isLeaf(root)) {
            res.add(root.val);
            return;
        }
        if (root.left != null) addLeaves(root.left, res);
        if (root.right != null) addLeaves(root.right, res);
    }

    // Print Boundary Function
    static ArrayList <Integer> printBoundary(Node node) {
        ArrayList <Integer> ans = new ArrayList <Integer> ();
        if (isLeaf(node) == false) ans.add(node.val);
        addLeftBoundary(node, ans);
        addLeaves(node, ans);
        addRightBoundary(node, ans);
        return ans;
    }

    // Main Function
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.left.right = new Node(4);
        root.left.left.right.left = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(7);
        root.right.right = new Node(8);
        root.right.right.left = new Node(9);
        root.right.right.left.left = new Node(10);
        root.right.right.left.right = new Node(11);

        ArrayList <Integer> boundaryTraversal;
        boundaryTraversal = printBoundary(root);

        System.out.println("The Boundary Traversal is : ");
        for (int i = 0; i < boundaryTraversal.size(); i++) {
            System.out.print(boundaryTraversal.get(i) + " ");
        }
    }
}

// Output -
/*
The Boundary Traversal is : 1 2 3 4 5 6 10 11 9 8 7
*/

// Logic -
/*
Approach: Boundary traversal in an anti-clockwise direction can be described as a traversal consisting of three parts:
Part 1: Left Boundary of the tree (excluding the leaf nodes).
Part 2: All the leaf nodes travelled in the left to right direction.
Part 3: Right Boundary of the tree (excluding the leaf nodes), traversed in the reverse direction.
 */

// Time & Space Complexity -
/*
Time Complexity: O(N).
Reason: The time complexity will be O(H) + O(H) + O(N) which is ≈ O(N)
Space Complexity: O(N)
Reason: Space is needed for the recursion stack while adding leaves. In the worst case (skewed tree),
space complexity can be O(N)
 */