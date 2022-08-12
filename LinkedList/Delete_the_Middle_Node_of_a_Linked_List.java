package LinkedList;

public class Delete_the_Middle_Node_of_a_Linked_List {

    // Definition for singly-linked list.
    public class ListNode {
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

    // Solution class (Main)
    class Solution {
        // Delete Middle Node Function
        public ListNode deleteMiddle(ListNode head) {
            // If, head is null means 0 element in the Linked List
            // If, head next is null means 1 element in the Linked List
            // In both case return head
            if(head == null || head.next == null) {
                return null;
            }

            // Create 3 variable slow, fast & prev
            // & initialize with head
            ListNode slow = head;
            ListNode fast = head;
            ListNode prev = head;

            // Check, while fast is not null
            // && fast.next is not null until
            // previous will become slow &
            // slow pointer will move one step
            // & fast pointer will move 2 steps
            while (fast != null && fast.next != null) {
                prev = slow;
                slow = slow.next;
                fast = fast.next.next;
            }
            // Link between the value of slow.next will move to the prev.next
            prev.next = slow.next;
            // finally, return head pointer
            return head;
        }
    }
}

// Output -
/*
Input: head = [1,3,4,7,1,2,6]
Output: [1,3,4,1,2,6]
Explanation:
The above figure represents the given linked list. The indices of the nodes are written below.
Since n = 7, node 3 with value 7 is the middle node, which is marked in red.
We return the new list after removing this node.
*/

// Algorithm -
/*
1. Create 3 variable slow, fast & prev & initialize with head
2. Check, while fast is not null && fast.next is not null until
   previous will become slow & slow pointer will move one step
   & fast pointer will move 2 steps
3. Link between the value of slow.next will move to the prev.next
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
*/