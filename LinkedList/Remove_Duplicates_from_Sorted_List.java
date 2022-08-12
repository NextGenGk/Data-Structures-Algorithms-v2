package LinkedList;

public class Remove_Duplicates_from_Sorted_List {

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
        // Delete Duplicates Function
        public ListNode deleteDuplicates(ListNode head) {
            // If, list have no elements
            if(head == null) return head;

            // Create a curr variable
            // & initialize with head
            ListNode curr = head;
            // while curr next is not null
            while (curr.next != null) {
                // then, check if, the value of curr element & next element are same then
                // curr next next to curr next
                if (curr.val == curr.next.val) {
                    curr.next = curr.next.next;
                }
                // Else, going to the next element
                else {
                    curr = curr.next;
                }
            }
            // Finally, return head;
            return head;
        }
    }
}

// Output -
/*
Input: head = [1,1,2,3,3]
Output: [1,2,3]
*/

// Algorithm -
/*
1. Create a curr variable & initialize with head
2. while curr next is not null then check,
    1. Check, if the value of curr element & next element are same then
       curr next next to curr next
    2. Else, going to the next element
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
*/