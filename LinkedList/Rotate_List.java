package LinkedList;

public class Rotate_List {

    // Definition for singly-linked list.
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        // Rotate List Function
        public ListNode rotateRight(ListNode head, int k) {
            // base case
            if (head == null) return head;

            // initialize variables
            int len = 1;
            ListNode newHead = head;
            ListNode tail = head;

            // length of Linked list
            while (tail.next != null) {
                tail = tail.next;
                len++;
            }
            // last element next pointer points to head
            tail.next = head;

            // find k
            k = k % len;

            // looping through length - k times
            for (int i = 0; i < len - k; i++)
                // tail should increase by one step
                tail = tail.next;
            // tail's next pointer points to newHead
            newHead = tail.next;
            // & null is points tail.next
            tail.next = null;
            // finally, return newHead
            return newHead;
        }
    }
}

// Output -
/*
Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]
*/

// Time & Space Complexity -
/*
Time - O(N), where N is for linearly traversing
Space - O(1), no extra space is needed
*/