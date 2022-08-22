package Trees;

public class Serialize_and_Deserialize_BST {

    // Definition for a binary tree node.
      public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
      }

    public class Codec {
        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            // if root is null, return empty string
            if (root == null) return "";
            // create a stringBuilder object
            StringBuilder sb = new StringBuilder();
            // call dfs (preorder traversal)
            dfs(root, sb);
            // finally, return sb (type of string)
            return sb.toString();
        }

        // Simply dfs (Pre Order Traversal)
        private void dfs(TreeNode root, StringBuilder sb) {
            // base case
            if (root == null) return;
            // Root -> Left -> Right
            sb.append(root.val + " ");
            dfs(root.left, sb);
            dfs(root.right, sb);
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            // if, data is empty return null
            if (data.isEmpty()) return null;
            // convert string value to array
            String[] s = data.split(" ");
            // call constructBST Function
            return constructBST(s, 0, s.length - 1);
        }

        // Construct Binary Search Tree From Pre Order Traversal
        private TreeNode constructBST(String[] s, int start, int end) {
            // base case
            if (start > end) return null;

            // create a root node & store the value of start
            TreeNode root = new TreeNode(Integer.parseInt(s[start]));

            // looping for find which value is added to the left & which value is added to the right
            int index;
            for (index = start; index <= end; index++) {
                // in any case index is greater than start, then break the loop
                if (Integer.parseInt(s[index]) > Integer.parseInt(s[start])) {
                    break;
                }
            }

            // recursive call for left & right subtree
            root.left = constructBST(s, start + 1, index - 1);
            root.right = constructBST(s, index, end);

            // finally return root
            return root;
        }
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;

// Output -
/*
Input: root = [2,1,3]
Output: [2,1,3]
*/

// Idea -
/*
1. Simply use Pre Order Traversal
2. & use construct BST from pre order traversal function
Serialize - convert root value to string
Deserialize - convert string value to root
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(n)
*/