package Trees;

import java.util.*;

public class Binary_Tree_Zig_Zag_Level_Order_Traversal {

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
        // Zig Zag Level Order Traversal Function
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            // Create a queue
            Queue<TreeNode> q = new LinkedList<>();
            // Create a list
            List<List<Integer>> wrapList = new ArrayList<>();

            // if root is null, return empty list
            if (root == null) return wrapList;

            // add first element to queue
            q.add(root);
            // zig zag traversal (false - means reverse the list)
            boolean leftToRight = true;

            // while queue is not Empty
            while (!q.isEmpty()) {
                // calculate the size of queue
                int size = q.size();

                // create a list
                List<Integer> subList = new ArrayList<>();

                // while size is greater than 0
                while (size > 0) {
                    // remove current element
                    TreeNode curr = q.poll();
                    // & to the subList
                    subList.add(curr.val);
                    // & decrease the size by one
                    size--;

                    // current left is not null
                    // queue add current left
                    if (curr.left != null) {
                        q.add(curr.left);
                    }

                    // current right is not null
                    // queue add current right
                    if (curr.right != null) {
                        q.add(curr.right);
                    }
                }
                // if, leftToRight is true, do nothing
                if (leftToRight) {
                    // do nothing
                }
                // else, reverse the subList
                else {
                    Collections.reverse(subList);
                }
                // & added to the main List (wrapList)
                wrapList.add(subList);
                // is each level wise traversal
                // if leftToRight is true then convert it to false
                // & leftToRight is false then convert it to true in each traversal
                leftToRight = !leftToRight;
            }
            // finally, return main List (wrapList)
            return wrapList;
        }
    }
}

// Output -
/*
Input: root = [3,9,20,null,null,15,7]
Output: [[3],[20,9],[15,7]]
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(n) for queue data structure
*/