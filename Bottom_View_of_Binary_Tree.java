import java.util.*;

public class Bottom_View_of_Binary_Tree {

    //User function Template for Java
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
        //Function to return a list containing the bottom view of the given tree.
        static ArrayList<Integer> bottomView(Node root) {
            // create queue with pair type
            Queue<Pair> q = new ArrayDeque<>();
            // map <Key, Value> (value in sorted order - TreeMap)
            Map<Integer, Integer> map = new TreeMap<>();

            // queue add new Pair
            // distance 0, root
            q.add(new Pair(0, root));
            // while queue is not empty
            while (!q.isEmpty()) {
                // remove current element
                Pair curr = q.poll();
                // add this current horizontal element
                // & add current node data (update)
                map.put(curr.hd, curr.node.data);

                // if, left side is not null
                // left horizontal distance - 1
                if (curr.node.left != null) {
                    q.add(new Pair(curr.hd - 1, curr.node.left));
                }

                // if, right side is not null
                // right horizontal distance + 1
                if (curr.node.right != null) {
                    q.add(new Pair(curr.hd + 1, curr.node.right));
                }
            }

            // create a arraylist & traverse in map
            // & add this map value on arraylist
            ArrayList<Integer> ans = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                ans.add(entry.getValue());
            }
            // finally, return ans
            return ans;
        }

        // create pair class
        static class Pair {
            int hd;
            Node node;

            // create constructor
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
    3     2
Output: 3 1 2
Explanation:
First case represents a tree with 3 nodes
and 2 edges where root is 1, left child of
1 is 3 and right child of 1 is 2.
*/

// Idea -
// Always update the map if, same key -> value is encountered

// Time & Space Complexity -
/*
Time - n*log(n)), where n is the number of nodes in the given tree.
Space - O(n), As we store nodes in the map and queue.
*/