public class Remove_Linked_List_Elements {

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
        // Remove Elements Function
        public ListNode removeElements(ListNode head, int val) {
            // List have only 0 element &
            // head value is equal to given value
            // then head next element is store in head
            while (head != null && head.val == val) {
                head = head.next;
            }

            // If, head is equal to null means
            // return the head pointer
            if (head == null) {
                return head;
            }

            // Create a temp node & assign head to it
            ListNode temp = head;
            // Chcek, while temp next is not equal to null
            while (temp.next != null) {
                // & temp next val is equal to given value
                // means temp next next value is store in temp next
                if (temp.next.val == val) {
                    temp.next = temp.next.next;
                }
                // else, tamp next value is store in temp variable
                else {
                    temp = temp.next;
                }
            }
            // Finally, return head of the Linked List
            return head;
        }
    }
}

// Output -
/*
Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]

Input: head = [7,7,7,7], val = 7
Output: []
*/

// Algorithm -
/*
1. List have only 0 element & head value is equal to given value
   then head next element is store in head
2. If, head is equal to null means return the head pointer
3. Create a temp node & assign head to it
4. Check, while temp next is not equal to null
   1. & temp next val is equal to given value
      means temp next next value is store in temp next
5. Else, temp next value is store in temp variable
6. Finally, return head of the Linked List
*/

// Time & Space Complexity -
/*
Time- O(n)
Space - O(1)
*/