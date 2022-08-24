package Trees;

import java.util.*;

public class All_Nodes_Distance_K_in_BT {

    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        // Find Distance k Function
        public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
            // create a list which stores answer
            List<Integer> res = new ArrayList<>();
            if (root == null) return null;
            // create a Map which stores Child's Parent root
            HashMap<TreeNode, TreeNode> parentMap = new HashMap<>();
            // call findParent Function
            findParent(parentMap, root);
            // create a queue for bfs traversal
            Queue<TreeNode> q = new LinkedList<>();
            // create a hashSet which is used for visiting a node or not
            HashSet<TreeNode> visited = new HashSet<>();
            // target value is added to the queue
            q.add(target);

            // Simple BFS Traversal
            while (!q.isEmpty()) {
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    TreeNode curr = q.poll();
                    // add the current node in set
                    visited.add(curr);
                    // if, k is equal to 0
                    // than current value is added to the result
                    if (k == 0) {
                        res.add(curr.val);
                    }

                    // if, parentMap contains current node value & visited no contains current node value
                    // then current node value is added to the queue
                    if (parentMap.containsKey(curr) && !visited.contains(parentMap.get(curr))) {
                        q.add(parentMap.get(curr));
                    }

                    // for left subtree
                    if (curr.left != null && !visited.contains(curr.left)) {
                        q.add(curr.left);
                    }

                    // for right subtree
                    if (curr.right != null && !visited.contains(curr.right)) {
                        q.add(curr.right);
                    }
                }
                // in each iteration k should, decrease by one
                // if, k is less than zero than break the iteration
                k--;
                if (k < 0) break;
            }
            // finally, return result
            return res;
        }

        // Find Parent Function (which map child's parent root)
        private static void findParent(HashMap<TreeNode, TreeNode> hm, TreeNode root) {
            // base case
            if (root == null) return;

            // if, left is not null
            // than map child's parent root
            if (root.left != null) {
                hm.put(root.left, root);
            }

            // if, right is not null
            // than map child's parent root
            if (root.right != null) {
                hm.put(root.right, root);
            }

            // recursive call for left & right side
            findParent(hm, root.left);
            findParent(hm, root.right);
        }
    }
}

// Output -
/*
Input: root = [3,5,1,6,2,0,8,null,null,7,4], target = 5, k = 2
Output: [7,4,1]
Explanation: The nodes that are a distance 2 from the target node (with value 5) have values 7, 4, and 1.
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(n)
*/