package Trees;

public class Populating_Next_Right_Pointers_in_Each_Node {

    // Definition for a Node.
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
        }
    };

    class Solution {
        // Connect Function
        public Node connect(Node root) {
            // if, root is null, return null
            if (root == null) return null;

            // create a variable curr & store tha value of root
            Node curr = root;

            // while, curr left not null
            while (curr.left != null) {
                // create a temp variable and store the value of curr
                Node temp = curr;
                // while, curr is not null
                while (curr != null) {
                    // check if, curr left is not null, then curr.left.next = curr.right
                    if (curr.left != null) curr.left.next = curr.right;
                    // check, curr right is not null & curr next is not  null, then curr.right.next = curr.next.left
                    if (curr.right != null && curr.next != null) curr.right.next = curr.next.left;
                    // in each iteration curr is increase by one
                    curr = curr.next;
                }
                // curr store left of temp
                curr = temp.left;
            }
            // finally, return root of the tree
            return root;
        }
    }
}

// Output -
/*
Input: root = [1,2,3,4,5,6,7]
Output: [1,#,2,3,#,4,5,6,7,#]
Explanation: Given the above perfect binary tree (Figure A), your function should populate each next pointer to point to its next right node, just like in Figure B. The serialized output is in level order as connected by the next pointers, with '#' signifying the end of each level.
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
*/