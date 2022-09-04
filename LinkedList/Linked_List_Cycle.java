package LinkedList;

public class Linked_List_Cycle {

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
    public class Solution {
        // Detect Cycle in Linked List Function
        public boolean hasCycle(ListNode head) {
            // If head is null & head.next is null then return false
            // this is for negative position
            if (head == null || head.next == null) {
                return false;
            }

            // ListNode slow & fast pointer
            // Initialize with head
            ListNode slow = head;
            ListNode fast = head;

            // Check, while fast is not null
            // && fast.next is not null until
            // slow pointer will move one step
            // & fast pointer will move 2 steps
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                // Check, in any case
                // slow pointer matches with fast pointer
                // return true which means cycle is present
                if (slow == fast) {
                    return true;
                }
            }
            // return false which means cycle is not present
            return false;
        }
    }
}

// Output -
/*
Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
*/

// Algorithm -
/*
1. ListNode slow & fast pointer initialize with head
2. Check, while slow is not null & fast is not null until
   slow pointer will move one step & fast pointer will move 2 steps
3. Check, in any case slow pointer matches with fast pointer
   return true which means cycle is present in Linked List
4. return false which means cycle is not present in Linked List
*/

// Time & Space Complexity -
/*
Time - O(N)
Space - O(1)
*/