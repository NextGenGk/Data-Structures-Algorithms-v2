import java.util.*;

public class Top_View_of_Binary_Tree {

    //User function Template for Java
    class Node  {
        int data;
        Node left;
        Node right;
     Node(int data){
        this.data = data;
        left=null;
        right=null;
        }
    }


    class Solution {
        //Function to return a list of nodes visible from the top view
        //from left to right in Binary Tree.
        static ArrayList<Integer> topView(Node root) {
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
                // if, map not contains current horizontal value
                if (!map.containsKey(curr.hd)) {
                    // add this current horizontal element
                    // & add current node data
                    map.put(curr.hd, curr.node.data);
                }

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
   /    \
  2      3
Output: 2 1 3
*/

// Time & Space Complexity -
/*
Time - n*log(n)), where n is the number of nodes in the given tree.
Space - O(n), As we store nodes in the map and queue.
*/