package Trees;

public class Populating_Next_Right_Pointers_in_Each_Node_II {

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
            // call build Tree Function
            buildTree(root);
            // return root
            return root;
        }

        // Build Tree Function
        void buildTree(Node root) {
            // if root is not null
            while (root != null) {
                // create a dummy node with value of 0
                Node dummy = new Node(0);
                // create a variable prev which stores the value of dummy node
                Node prev = dummy;

                // looping till current is not equal to null
                for (Node curr = root; curr != null; curr = curr.next) {
                    // if left is not null
                    // then, current left value points to previous next
                    // & current right is points to previous
                    if (curr.left != null) {
                        prev.next = curr.left;
                        prev = curr.left;
                    }
                    // if right is not null
                    // then, current right value points to previous next
                    // & current right is points to previous
                    if (curr.right != null) {
                        prev.next = curr.right;
                        prev = curr.right;
                    }
                }
                // for new level
                // dummy next value is store in root (in this case 0)
                root = dummy.next;
            }
        }
    }
}

// Output -
/*
Input: root = [1,2,3,4,5,null,7]
Output: [1,#,2,3,#,4,5,7,#]
Explanation: Given the above binary tree (Figure A), your function should populate each next pointer to point to its next right node, just like in Figure B. The serialized output is in level order as connected by the next pointers, with '#' signifying the end of each level.
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
*/