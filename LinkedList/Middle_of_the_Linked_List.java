package LinkedList;

public class Middle_of_the_Linked_List {

    // Definition for singly-linked list.
    private class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Solution Class (Main)
    class Solution {
        // Find Middle Node Function
        public ListNode middleNode(ListNode head) {
//         // If head is null & head.next is null then return false
//         // this is for negative position
//         if(head == null || head.next == null) {
//             return null;
//         }

            // ListNode slow & fast pointer
            // Initialize with head
            ListNode slow = head;
            ListNode fast = head;

            // Check, while fast is not null
            // && fast next is not null until
            // slow pointer will move one step
            // & fast pointer will move 2 steps
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            // return the slow pointer
            return slow;
        }
    }
}

// Output -
/*
Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.

Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
*/

// Algorithm -
/*
1. ListNode slow & fast pointer initialize with head
2. Check, while fast is not null && fast next is not null until
   slow pointer will move one step & fast pointer will move 2 steps
3. Slow pointer is half of the fast pointer, so return slow pointer
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
*/