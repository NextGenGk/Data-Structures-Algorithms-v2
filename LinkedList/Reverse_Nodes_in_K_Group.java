package LinkedList;

public class Reverse_Nodes_in_K_Group {

    // Definition for singly-linked list.
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        // Simple Length of Linked list Function
        public int length(ListNode head) {
            int count = 0;
            ListNode curr = head;
            while (curr != null) {
                curr = curr.next;
                count++;
            }
            return count;
        }

        // Reverse Function
        public ListNode reverseKGroup(ListNode head, int k, int length) {
            // base case
            if (length < k) return head;

            // initialize variables
            int count = 0;
            ListNode curr = head;
            ListNode prev = null;
            ListNode temp = null;

            // condition curr is not equal to null
            // && count is less than k
            while (curr != null && count < k) {
                temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
                count++;
            }

            // connect reverse recursion function to head next
            if (temp != null) {
                head.next = reverseKGroup(temp, k, length - k);
            }

            return prev;
        }

        // Reverse K Group Function
        public ListNode reverseKGroup(ListNode head, int k) {
            // calculate length
            int length = length(head);
            // call reverseKGroup function
            return reverseKGroup(head, k, length);
        }
    }
}

// Output -
/*
Input: head = [1,2,3,4,5], k = 2
Output: [2,1,4,3,5]
*/

// Time & Space Complexity -
/*
Time - O(N)
Space - O(1)
*/