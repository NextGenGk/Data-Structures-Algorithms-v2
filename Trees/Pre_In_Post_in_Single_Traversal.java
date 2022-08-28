package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static Trees.Pre_In_Post_in_Single_Traversal.Solution.allTraversal;

public class Pre_In_Post_in_Single_Traversal {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static class Pair {
        TreeNode node;
        int num;
        Pair(TreeNode node, int num) {
            this.node = node;
            this.num = num;
        }
    }

    class Solution {
        public static void allTraversal(TreeNode root, List<Integer> pre, List<Integer> in, List<Integer> post) {
            // create a stack (type of Pair)
            Stack<Pair> st = new Stack<Pair>();
            // push root element to the stack
            st.push(new Pair(root, 1));

            // base case
            if (root == null) return;

            while (!st.isEmpty()) {
                Pair it = st.pop();

                // this is part of pre
                // increment 1 to 2
                // push the left side of the tree
                if (it.num == 1) {
                    pre.add(it.node.val);
                    it.num++;
                    st.push(it);

                    if (it.node.left != null) {
                        st.push(new Pair(it.node.left, 1));
                    }
                }

                // this is a part of in
                // increment 2 to 3
                // push right
                else if (it.num == 2) {
                    in.add(it.node.val);
                    it.num++;
                    st.push(it);

                    if (it.node.right != null) {
                        st.push(new Pair(it.node.right, 1));
                    }
                }
                // don't push it back again
                else {
                    post.add(it.node.val);
                }
            }
        }
    }

    // Main Function
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List < Integer > pre = new ArrayList< >();
        List < Integer > in = new ArrayList < > ();
        List < Integer > post = new ArrayList < > ();
        allTraversal(root, pre, in , post);

        System.out.println("The preorder Traversal is : ");
        for (int nodeVal: pre) {
            System.out.print(nodeVal + " ");
        }
        System.out.println();
        System.out.println("The inorder Traversal is : ");
        for (int nodeVal: in ) {
            System.out.print(nodeVal + " ");
        }
        System.out.println();
        System.out.println("The postorder Traversal is : ");
        for (int nodeVal: post) {
            System.out.print(nodeVal + " ");
        }
        System.out.println();
    }
}

// Output -
/*
The preorder Traversal is :
1 2 4 5 3 6 7
The inorder Traversal is :
4 2 5 1 6 3 7
The postorder Traversal is :
4 5 2 6 7 3 1
 */

// Approach -
/*
Approach:

The algorithm steps can be described as follows:
We take a stack data structure and push a pair<val, num> to it. Here Val is the value of the root node and num
the visit to the node. Initially, the num is 1 as we are visiting the root node for the first time. We also create
three separate lists for preorder, inorder and postorder traversals. Then we set an iterative loop to run till
the time our stack is non-empty.

In every iteration, we pop the top of the stack (say, T). Then we check the second value(num) of T. Three cases can arise:

Case 1 : When num==1
This means that we are visiting the node for the very first time, therefore we push the node value to our preorder list.
Then we push the same node with num=2(for Case 2). After this, we want to visit the left child. Therefore we make a new pair Y(<val, num>) and push it to the stack (if there exists a left child). The val of Y is equal to the left child’s node value and num is equal to 1.

Case 2 : When num==2
This means that we are visiting the node for the second time, therefore on our second visit to the node, we push the
node value to our inorder list. Then we push the same node with num=3( for Case 3). After this, we want to visit the
right child. Therefore as in the first case, we check if there exists a right child or not. If there is, we push the
right child and num value=1 as a pair to our stack.

Case 3 When num==3
This means that we are visiting the node for the third time. Therefore we will push that node’s value to our postorder
list. Next, we simply want to return to the parent so we will not push anything else to the stack.
 */

// Time & Space Complexity -
/*
Time - O(n), O(3xn)
Space - O(n), O(4n)
 */


