package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Serialize_and_Deserialize_BT {

    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Codec {
        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            // if root is null, return empty string
            if (root == null) return "";
            // create a queue
            Queue<TreeNode> q = new LinkedList<>();
            // create a stringBuilder object
            StringBuilder res = new StringBuilder();
            // add 1st value added to the queue
            q.add(root);
            // while queue is not empty
            while (!q.isEmpty()) {
                // remove 1st element to the queue
                TreeNode node = q.poll();
                // if, node is null, then added everything you want like(#, null, n) etc
                // then added n to the result
                if (node == null) {
                    res.append("n ");
                    continue;
                }
                // then added the node value in result
                res.append(node.val + " ");
                // recursive call for left subtree and added to the queue
                q.add(node.left);
                // recursive call for right subtree and added to the queue
                q.add(node.right);
            }
            // finally, return result (type of string)
            return res.toString();
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            // if, data is empty return null
            if (data == "") return null;
            // create a queue
            Queue<TreeNode> q = new LinkedList<>();
            // convert string value to array
            String[] values = data.split(" ");
            // create a root node with the index of 0
            TreeNode root = new TreeNode(Integer.parseInt(values[0]));
            // and added to the queue
            q.add(root);
            // looping through values length
            for (int i = 1; i < values.length; i++) {
                // remove 1st element to the queue
                TreeNode parent = q.poll();
                // if, values is not equal to n
                if (!values[i].equals("n")) {
                    // then create a variable left & store the values of index i
                    TreeNode left = new TreeNode(Integer.parseInt(values[i]));
                    // then left variable is assign to the parent left
                    parent.left = left;
                    // & left node is added to the queue
                    q.add(left);
                }
                // if, values is not equal to n
                if (!values[i++].equals("n")) {
                    // then create a variable right & store the values of index i
                    TreeNode right = new TreeNode(Integer.parseInt(values[i]));
                    // then right variable is assign to the parent left
                    parent.right = right;
                    // & right node is added to the queue
                    q.add(right);
                }
            }
            // finally, return root node
            return root;
        }
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));

// Output -
/*
Input: root = [1,2,3,null,null,4,5]
Output: [1,2,3,null,null,4,5]
*/

// Idea -
/*
Simply use level Order Traversal
Serialize - convert root value to string
Deserialize - convert string value to root
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(n)
*/

// Approach 2
/*
public class Codec {
    public String serialize(TreeNode root) {
        if (root == null) return "";
        return root.val + "," + serialize(root.left) + "," + serialize(root.right);
    }

    public TreeNode deserialize(String data) {
        Queue<String> queue = new LinkedList<>(Arrays.asList(data.split(",",-1)));
        return helper(queue);
    }

    private TreeNode helper(Queue<String> queue) {
        String s = queue.poll();
        if (s.isEmpty()) return null;
        TreeNode root = new TreeNode(Integer.valueOf(s));
        root.left = helper(queue);
        root.right = helper(queue);
        return root;
    }
}

// Idea -
/*
Simply use PreOrder Traversal
Serialize - convert root value to string
Deserialize - convert string value to root
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(n)
*/
