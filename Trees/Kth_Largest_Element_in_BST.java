package Trees;

public class Kth_Largest_Element_in_BST {

    // Definition for a binary tree node.
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    class Solution {
        // declare two variable count and ans
        int count = 0;
        int ans = 0;

        // return the Kth largest element in the given BST rooted at 'root'
        public int kthLargest(Node root, int K) {
            // call findKthElement Function
            findKthElement(root, K);
            // return ans
            return ans;

        }

        // Find Kth Element Function
        public void findKthElement(Node root, int K) {
            // if, root right is not null
            // recursive call for right subtree
            if (root.right != null) {
                findKthElement(root.right, K);
            }

            // Each right subtree iteration increase the count by one
            // if, count is equal to k,
            // then add the value of node in variable ans, then return
            count++;
            if (count == K) {
                ans = root.data;
                return;
            }

            // if, root left is not null
            // recursive call for left subtree
            if (root.left != null) {
                findKthElement(root.left, K);
            }
        }
    }
}

// Output -
/*
Input:
      4
    /   \
   2     9
k = 2
Output: 4
*/

// Idea -
// Simple Reverse Inorder right -> root -> left

// Time & Space Complexity -
/*
Time - O(min(K,N))
Space - O(min(K,N))
*/