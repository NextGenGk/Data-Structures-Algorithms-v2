package Trees;

public class Find_Min_and_Max_Value_in_BT {

    //Definition for a binary tree node.
    public static class TreeNode {
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

    // Find Min & Max Value in BT
    static class BinaryTree {
        TreeNode root;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        public void findMinMaxValue(TreeNode root) {
            if (root == null) return;
            if (root.val > max) max = root.val;
            if (root.val < min) min = root.val;

            findMinMaxValue(root.left);
            findMinMaxValue(root.right);
        }

        // create nod function
        public TreeNode createNewNode(int val) {
            TreeNode newNode = new TreeNode();
            newNode.val = val;
            newNode.left = null;
            newNode.right = null;
            return newNode;
        }
    }

    // Main Function
    public static void main(String[] args) {
        BinaryTree a = new BinaryTree();

        TreeNode root = a.createNewNode(2);
        root.left = a.createNewNode(7);
        root.right = a.createNewNode(5);
        root.left.left = a.createNewNode(2);
        root.left.right = a.createNewNode(6);
        root.left.right.left = a.createNewNode(5);
        root.left.right.right = a.createNewNode(1);
        root.right.right = a.createNewNode(9);
        root.right.right.left = a.createNewNode(4);

        a.findMinMaxValue(root);
        System.out.println(a.min);
        System.out.println(a.max);
    }
}

// Output -
/*
1
9
 */

// Time & Space Complexity -
/*
Time Complexity: O(N).
In the recursive function calls, every node of the tree is processed once and hence the complexity due to the function
is O(N) if there are total N nodes in the tree. Therefore, the time complexity is O(N).

Space Complexity: O(N).
Recursive call is happening. The every node is processed once and considering the stack space,
the space complexity will be O(N).
 */