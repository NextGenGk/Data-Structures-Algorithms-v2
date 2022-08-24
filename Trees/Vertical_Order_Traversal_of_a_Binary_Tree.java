package Trees;

import java.util.*;

public class Vertical_Order_Traversal_of_a_Binary_Tree {

    // Definition for a binary tree node.
    public class Node {
        int data;
        Node left;
        Node right;

        Node() {
        }

        Node(int val) {
            this.data = data;
        }

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        // Function to find the vertical order traversal of Binary Tree.
        static ArrayList<Integer> verticalOrder(Node root) {
            // create a queue
            Queue<Pair> q = new ArrayDeque<>();
            // create a map
            Map<Integer, ArrayList<Integer>> map = new TreeMap<>();

            // add root value to the queue
            q.add(new Pair(0, root));
            // while q is not empty
            while (!q.isEmpty()) {
                // remove the current element from queue
                Pair curr = q.poll();
                // if, map contains current horizontal distance
                // get the value of current horizontal distance and add the value of the node
                if (map.containsKey(curr.hd)) {
                    map.get(curr.hd).add(curr.node.data);
                }
                // else, create a arrayList
                // & add the value of node & put in the map
                else {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(curr.node.data);
                    map.put(curr.hd, temp);
                }

                // if, left is not null, added the children of left subtree
                // for left side horizontal distance decrease by 1
                if (curr.node.left != null) {
                    q.add(new Pair(curr.hd - 1, curr.node.left));
                }

                // if, right is not null, added the children of right subtree
                // for right side horizontal distance increase by 1
                if (curr.node.right != null) {
                    q.add(new Pair(curr.hd + 1, curr.node.right));
                }
            }

            // create a arrayList
            ArrayList<Integer> ans = new ArrayList<>();
            // iterating the map
            for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
                // and add the value to the arrayList
                ans.addAll(entry.getValue());
            }
            return ans;
        }

        // create class pair
        public static class Pair {
            int hd; // horizontal distance
            Node node;

            public Pair(int hd, Node node) {
                this.hd = hd;
                this.node = node;
            }
        }
    }
}

// Output -
/*
Input:
           1
         /   \
       2       3
     /   \   /   \
   4      5 6      7
              \      \
               8      9
Output:
4 2 1 5 6 3 8 7 9
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(n)
*/