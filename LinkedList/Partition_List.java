package LinkedList;

public class Partition_List {

     // Definition for singly-linked list.
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    // Solution Class (Main)
    class Solution {
        // Partition Function
        public ListNode partition(ListNode head, int x) {
            // Create two ListNode
            ListNode small = new ListNode(0);
            ListNode higher = new ListNode(0);

            // 1st ListNode point to smallHead variable
            // 2st ListNode point to higherHead variable
            ListNode smallHead = small;
            ListNode higherHead = higher;

            while (head != null) {
                // Check, if head value is less than x
                // then add this on small list
                if (head.val < x) {
                    // For Small list
                    smallHead.next = head;
                    smallHead = smallHead.next;
                } else {
                    // For Higher List
                    higherHead.next = head;
                    higherHead = higherHead.next;
                }
                // In, each iteration head is increment by 1
                head = head.next;
            }
            // higher next point to last index, null
            higherHead.next = null;
            // Connect smallhead last element to higher's 1st element
            smallHead.next = higher.next;

            return small.next;
        }
    }
}

// Output -
/*
Input: head = [1,4,3,2,5,2], x = 3
Output: [1,2,2,4,3,5]
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
*/