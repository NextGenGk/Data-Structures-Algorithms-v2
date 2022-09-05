package LinkedList;

public class Linked_List_Cycle_II {

     // Definition for singly-linked list.
      class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }

    // Detect Cycle head Function (Find cycle start index)
    public ListNode detectCycle(ListNode head) {
        // Create two pointer slow & fast with the type of ListNode &
        // Initialize with head
        ListNode slow = head;
        ListNode fast = head;

        // Check, while fast is not null
        // && fast.next is not null until
        // slow pointer will move one step
        // & fast pointer will move 2 steps
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            // Check, in any point slow is equal to fast
            // then fast is started from head, & slow is started
            // from will start from where it was, &
            // both are increment by 1 step
            if(slow == fast) {
                while(head != slow) {
                    slow = slow.next;
                    head = head.next;
                }
                // finally, return slow pointer
                return slow;
            }
        }
        // In, any case cycle is not present, then return null
        return null;
    }
}

// Output -
/*
Input: head = [3,2,0,-4], pos = 1
Output: tail connects to node index 1
Explanation: There is a cycle in the linked list, where tail connects to the second node.
*/

// Algorithm -
/*
1. Create two pointer slow & fast with the type of ListNode &
   Initialize with head
2. Check, while fast is not null && fast.next is not null until
   slow pointer will move one step & fast pointer will move 2 steps
3. Check, in any point slow is equal to fast then fast is started from head,
   & slow is started from will start from where it was, &
   both are increment by 1 step
4. Finally, return slow pointer
5. In, any case cycle is not present, then return null
*/

// Logic -
/*
if slow and fast pointer is same, than fast is started from head, and check if slow is equal to fast, which means we find the starting index of loop
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
*/