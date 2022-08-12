public class Convert_Sorted_List_to_BST {

     //Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

     // Definition for a binary tree node.
      public class TreeNode {
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

    class Solution {
        // Sorted List To BST Function
        public TreeNode sortedListToBST(ListNode head) {
            // if, head is null, means tree is doesn't exist
            if (head == null) return null;
            // if, head next is null, then return head value
            if (head.next == null) return new TreeNode(head.val);

            // Find Middle element
            ListNode slow = head;
            ListNode fast = head;
            ListNode prev = slow;

            // while fast is not equal to null &
            // fast next is not equal to null then
            while (fast != null && fast.next != null) {
                // maintain prev variable to store slow value
                prev = slow;
                slow = slow.next;
                fast = fast.next.next;
            }

            // create a node and add slow value on it
            TreeNode node = new TreeNode(slow.val);

            // & null is assign to previous next
            prev.next = null;
            // recursive call for left subtree
            node.left = sortedListToBST(head);
            // recursive call for right subtree
            node.right = sortedListToBST(slow.next);

            // finally, return node
            return node;
        }
    }
}

// Output -
/*
Input: head = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: One possible answer is [0,-3,9,-10,null,5], which represents the shown height balanced BST.
*/

// Time & Space Complexity -
/*
Time - O(nlogn)
Space - O(n) because we are creating a tree of n nodes.
*/