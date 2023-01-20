package LinkedList;

public class Odd_Even_Linked_List {

   // Definition for singly-linked list.
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        // Odd Even List Function
        public ListNode oddEvenList(ListNode head) {
            // base case
            if (head == null || head.next == null) return head;

            // create three variable odd, even, evenHead
            // odd points to head, even points to head next & evenHead points to even
            ListNode odd = head;
            ListNode even = head.next;
            ListNode evenHead = even;

            // while, odd next && even next is not equal to null
            while (odd.next != null && even.next != null) {
                odd.next = even.next;
                odd = odd.next;
                even.next = odd.next;
                even = even.next;
            }
            // connect odd next to evenHead
            odd.next = evenHead;
            return head;
        }
    }
}

// Output -
/*
Input: head = [1,2,3,4,5]
Output: [1,3,5,2,4]
*/

// Time & Space Complexity -
/*
Time - O(N)
Space - O(1), no extra space is needed
*/