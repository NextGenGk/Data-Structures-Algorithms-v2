package LinkedList;

public class Remove_Duplicates_from_Sorted_List_II {

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
            // Create a temp Node & assign value to it
            ListNode temp = new ListNode(0, head);
            // Create a prev variable & assign this new node to it
            ListNode prev = temp;

            // While, head is not null then,
            while (head != null) {
                // check, if head next is not null &
                // head val is equal to head next val
                if (head.next != null && head.val == head.next.val) {

                    // while, head next is not null &
                    // head val is equal to head next val
                    // if matches then increment the head pointer
                    while (head.next != null && head.val == head.next.val) {
                        head = head.next;
                    }
                    // If, not matches then,
                    // head next is add to prev next
                    prev.next = head.next;
                }
                // Else, increment the prev pointer by one
                else {
                    prev = prev.next;
                }
                // in each iteration, head is increment by one
                head = head.next;
            }
            // Finally, return temp next (head)
            return temp.next;
        }
    }
}

// Output -
/*
Input: head = [1,1,1,2,3]
Output: [2,3]
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
*/